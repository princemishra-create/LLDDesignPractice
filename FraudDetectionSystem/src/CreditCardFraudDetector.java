public class CreditCardFraudDetector extends FraudDetectionSystem{
    private final int cvv;
    private final int otp;

    public CreditCardFraudDetector(int cvv, int otp){
        this.cvv = cvv;
        this.otp = otp;
    }

    @Override
    boolean authenticateInstrument() {
        System.out.println("checking cvv-" + cvv + " and otp-" + otp);
        return true;
    }

    @Override
    boolean runVelocityChecks() {
        System.out.println("Checking if there are transaction in more than one country");
        return false;
    }

    @Override
    void flagTransaction() {
        System.out.println("CRITICAL ALERT: Lock Credit Card immediately!");
    }
}
