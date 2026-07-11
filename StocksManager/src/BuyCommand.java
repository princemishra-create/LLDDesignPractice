public class BuyCommand implements Command {
    private String stockName;
    private int stockQuantity;
    private Portfolio portfolio;

    public BuyCommand(Portfolio _portfolio, String _stockName, int _stockQuantity) {
        portfolio = _portfolio;
        stockName = _stockName;
        stockQuantity = _stockQuantity;
    }

    @Override
    public void execute() {
        this.portfolio.addStocks(stockName, stockQuantity);
    }

    @Override
    public void undo() {
        this.portfolio.sellStocks(stockName, stockQuantity);
    }
}
