public class Money {
    private int totalAmount = 0;

    public void addMoney(int amount){
        this.totalAmount += amount;
    }

    public void reduceMoney(int amount){
        this.totalAmount -= amount;
    }

    public int getAmount(){
        return this.totalAmount;
    }
}
