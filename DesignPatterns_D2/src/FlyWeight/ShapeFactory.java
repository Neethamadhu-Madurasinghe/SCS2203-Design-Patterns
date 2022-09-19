package FlyWeight;

import java.util.HashMap;

public class ShapeFactory {
    private static HashMap<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

    public static Shape getShape(ShapeType type) {
        Shape tempShape = shapes.get(type);

        if(tempShape == null) {
            if(type.equals(ShapeType.OVAL_FILL)) {
                tempShape = new Oval(true);
            }else if(type.equals(ShapeType.OVAL_NOFILL)) {
                tempShape = new Oval(false);
            }else if(type.equals(ShapeType.LINE)) {
                tempShape = new Line();
            }

            shapes.put(type, tempShape);
        }
        return tempShape;
    }

    public static enum ShapeType {
        OVAL_FILL, OVAL_NOFILL, LINE
    }
}
