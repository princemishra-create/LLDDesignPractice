import java.util.HashMap;

public class Portfolio {
    private final HashMap<String, Integer> stocks;

    public Portfolio() {
        this.stocks = new HashMap<>();
    }

    public void addStocks(String stockName, int quantity) {
        stocks.put(stockName, stocks.computeIfAbsent(stockName, (k) -> 0) + quantity);
    }

    public void sellStocks(String stockName, int quantity){
        if(!this.stocks.containsKey(stockName)){
            return;
        }

        if(this.stocks.get(stockName) < quantity){
            return;
        }

        stocks.put(stockName, this.stocks.get(stockName) - quantity);
    }

    public void print(){
        this.stocks.forEach((key, value) ->{
            System.out.println("StockName: " + key + ", StockQuantity: " + value);
        });
    }
}
