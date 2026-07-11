//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    PaymentStrategy paymentStrategy1 = new UPIPayment("princemishra@google.com");
    PaymentStrategy paymentStrategy2 = new CreditCardPayment("12342141", "1243124", "234");
    ShoppingCart shoppingCart = new ShoppingCart(paymentStrategy1);

    shoppingCart.checkout(1500);

    shoppingCart.setPaymentStrategy(paymentStrategy2);
    shoppingCart.checkout(1500);
}
