public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    private int retriesLeft = 3;

    public ShoppingCart(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public boolean checkout(int amount){
        while(this.retriesLeft > 0){
            try{
                if(this.paymentStrategy.pay(amount)){
                    return true;
                }
            } catch (Exception e) {
                // log the exception
            }

            this.retriesLeft = this.retriesLeft - 1;
        }

        return false;
    }
}
