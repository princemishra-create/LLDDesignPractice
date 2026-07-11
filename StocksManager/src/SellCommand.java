public class SellCommand implements Command {
    private String stockName;
    private int stockQuantity;
    private Portfolio portfolio;

    public SellCommand(Portfolio _portfolio, String _stockName, int _stockQuantity) {
        portfolio = _portfolio;
        stockName = _stockName;
        stockQuantity = _stockQuantity;
    }

    @Override
    public void execute() {
        this.portfolio.sellStocks(stockName, stockQuantity);
    }

    @Override
    public void undo() {
    }
}