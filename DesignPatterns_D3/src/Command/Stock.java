package Command;

public class Stock {
    private String name = "Tesla";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [Name: " + this.name + ", Quantity: " + this.quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [Name: " + this.name + ", Quantity: " + this.quantity + " ] sold");
    }
}
