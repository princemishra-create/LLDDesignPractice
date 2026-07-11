//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Coffee coffee = new CoffeeBuilder().addCoffee(new Espresso()).addCondiment(new Mocha()).addCondiment(new Mocha()).addCondiment(new Milk()).addDiscount(new HappyHoursDiscount()).build();
    System.out.println("Printing Coffee Price - " + coffee.cost());
    System.out.println("Printing the description - " + coffee.getDescription());
}
