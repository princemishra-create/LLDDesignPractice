public class VendingMachineHasProductSelectedState implements VendingMachineStateActions {
    @Override
    public void insertMoney(VendingMachine vendingMachine, int amount) {
        System.out.println("You already has inserted enough money for selected product, no need to insert more money");
        vendingMachine.getMoneyReceived().addMoney(amount);
    }

    @Override
    public void dispenseCoin(VendingMachine vendingMachine) {
        int moneyToBeReturned = vendingMachine.getMoneyReceived().getAmount() - vendingMachine.getProduct().getCost();
        System.out.println("Dispensing amount: " + moneyToBeReturned + ". Please collect.");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, Product product) {
        System.out.println("Replacing previous product selection");

        int count = vendingMachine.getInventory().getProductCount(product);

        if(count == 0){
            System.out.println("No enough money please insert more money");
            return;
        }

        vendingMachine.setProduct(product);
        vendingMachine.updateState(new VendingMachineHasProductSelectedState());
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        vendingMachine.getInventory().decrementProduct(vendingMachine.getProduct());
        this.dispenseCoin(vendingMachine);
        System.out.println("Dispensing Product - " + vendingMachine.getProduct().getProductName());
        vendingMachine.updateState(new VendingMachineIdleState());
    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) {
        vendingMachine.updateState(new VendingMachineHasCancelTransactionState());
    }
}
