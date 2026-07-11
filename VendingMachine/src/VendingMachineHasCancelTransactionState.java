public class VendingMachineHasCancelTransactionState implements VendingMachineStateActions{
    @Override
    public void insertMoney(VendingMachine vendingMachine, int amount) {
        System.out.println("Don't insert more coins, transaction has been cancelled");
        vendingMachine.getMoneyReceived().addMoney(amount);
    }

    @Override
    public void dispenseCoin(VendingMachine vendingMachine) {
        int moneyToBeReturned = vendingMachine.getMoneyReceived().getAmount();
        System.out.println("Dispensing amount: " + moneyToBeReturned + ". Please collect.");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, Product product) {
        System.out.println("Can't select product now, transaction has been cancelled.");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Transaction has been cancelled can't dispense the product");
    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) {
        System.out.println("Cancelling Transaction");
        this.dispenseCoin(vendingMachine);
        vendingMachine.updateState(new VendingMachineIdleState());
    }
}
