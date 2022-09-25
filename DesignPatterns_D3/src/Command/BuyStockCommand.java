package Command;

public class BuyStockCommand implements Order{
    private Stock stock;

    public BuyStockCommand(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.buy();
    }
}
