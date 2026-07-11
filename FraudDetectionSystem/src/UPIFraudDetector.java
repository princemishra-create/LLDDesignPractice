public class UPIFraudDetector extends FraudDetectionSystem{
    private String upiPin;

    public UPIFraudDetector(String pin){
        this.upiPin = pin;
    }

    @Override
    boolean authenticateInstrument() {
        System.out.println("Checking UPI Pin");
        return true;
    }

    @Override
    boolean runVelocityChecks() {
        System.out.println("Checking no of transaction in last 5 minutes");
        return true;
    }
}
