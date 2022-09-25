package Command;

import java.util.ArrayList;

public class Brocker {
    private ArrayList<Order> orders = new ArrayList<Order>();

    public void takeOrder(Order order) {
        this.orders.add(order);
    }

    public void placeOrder() {
        for(Order order: this.orders) {
            order.execute();
        }

        orders.clear();
    }

}
