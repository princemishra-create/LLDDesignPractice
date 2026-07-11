//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Product product1 = new Product("product1", 231);
    Product product2 = new Product("product2", 21);
    Product product3 = new Product("product3", 22);
    Product product4 = new Product("product4", 434);
    Product product5 = new Product("product5", 255);

    Inventory inventory = new Inventory();
    inventory.addProduct(product1, 12);
    inventory.addProduct(product2, 33);
    inventory.addProduct(product3, 23);
    inventory.addProduct(product4, 55);
    inventory.addProduct(product5, 16);

    VendingMachine vendingMachine = new VendingMachine(inventory);

    vendingMachine.insertMoney(234);
    vendingMachine.insertMoney(24);
    vendingMachine.insertMoney(4);
    vendingMachine.insertMoney(3);

    vendingMachine.selectProduct(product1);

    vendingMachine.dispenseProduct();
}
