package Command;

public class SellStockCommand implements Order{
    private Stock stock;

    public SellStockCommand(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.sell();
    }
}
