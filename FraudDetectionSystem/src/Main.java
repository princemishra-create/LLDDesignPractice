//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    FraudDetectionSystem creditCardFraudDetection = new CreditCardFraudDetector(234, 324566);
    creditCardFraudDetection.execute();

    FraudDetectionSystem upiFraudDetection = new UPIFraudDetector("879402");
    upiFraudDetection.execute();
}
