public interface VendingMachineStateActions {
    void insertMoney(VendingMachine vendingMachine, int amount);
    void dispenseCoin(VendingMachine vendingMachine);
    void selectProduct(VendingMachine vendingMachine, Product product);
    void dispenseProduct(VendingMachine vendingMachine);
    void cancelTransaction(VendingMachine vendingMachine);
}
