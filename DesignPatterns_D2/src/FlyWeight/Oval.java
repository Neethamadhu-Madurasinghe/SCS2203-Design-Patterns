package FlyWeight;

import java.awt.*;

public class Oval implements Shape{
    private boolean fill;

    public Oval(boolean fill) {
        this.fill = fill;
        System.out.println("Creating an oval");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
        circle.setColor(color);
        if(this.fill) {
            circle.drawOval(x, y, width, height);
        }
    }
}
