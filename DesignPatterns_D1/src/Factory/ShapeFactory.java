package Factory;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }else if(shapeType.equals("circle")) {
            return new Circle();
        }else if(shapeType.equals("square")) {
            return new Square();
        }

        return null;
    }
}
