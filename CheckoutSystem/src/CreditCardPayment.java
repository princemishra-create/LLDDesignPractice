public class CreditCardPayment implements PaymentStrategy{
    private final String cardNumber;
    private final String expiryDate;
    private final String cvv;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public boolean pay(int amount) {
        // verify  above card

        System.out.println("Paid " + amount + " using Credit Card");
        return true;
    }
}
