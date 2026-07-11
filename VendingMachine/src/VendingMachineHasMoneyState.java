public class VendingMachineHasMoneyState implements VendingMachineStateActions{
    @Override
    public void insertMoney(VendingMachine vendingMachine, int amount) {
        vendingMachine.getMoneyReceived().addMoney(amount);
    }

    @Override
    public void dispenseCoin(VendingMachine vendingMachine) {
        System.out.println("Please cancel transaction or select some product");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, Product product) {
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
        System.out.println("Please select the product first.");
    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) {
        vendingMachine.updateState(new VendingMachineHasCancelTransactionState());
    }
}
