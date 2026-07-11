public class UPIPayment implements PaymentStrategy{
    private final String upiId;

    public UPIPayment(String upiId){
        this.upiId = upiId;
    }

    @Override
    public boolean pay(int amount) {
        // verify upiId

        System.out.println("Paid " + amount + " using UPI");
        return true;
    }
}
