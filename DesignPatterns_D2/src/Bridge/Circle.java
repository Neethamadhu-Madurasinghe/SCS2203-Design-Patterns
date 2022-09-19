package Bridge;

public class Circle extends Shape{
    public Circle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.println("Circle filled with color");
        super.color.applyColor();
    }
}
