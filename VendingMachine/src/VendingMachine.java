public class VendingMachine {
    private final Inventory inventory;
    private final Money totalMoneyReceived;
    private VendingMachineStateActions state;
    private Product selectedProduct;

    public VendingMachine(Inventory inventory){
        this.inventory = inventory;
        this.totalMoneyReceived = new Money();
        this.state = new VendingMachineIdleState();
    }

    public void updateState(VendingMachineStateActions state) {
        this.state = state;
    }

    public void insertMoney(int amount) {
        this.state.insertMoney(this, amount);
    }

    void selectProduct(Product product){
        this.state.selectProduct(this, product);
    }

    public void dispenseCoin() {
        this.state.dispenseCoin(this);
    }

    public void dispenseProduct() {
        this.state.dispenseProduct(this);
    }

    public void cancelTransaction() {
        this.state.cancelTransaction(this);
    }

    public Inventory getInventory(){
        return this.inventory;
    }

    public Money getMoneyReceived(){
        return this.totalMoneyReceived;
    }

    public void setProduct(Product product){
        this.selectedProduct = product;
    }

    public Product getProduct(){
        return this.selectedProduct;
    }
}
