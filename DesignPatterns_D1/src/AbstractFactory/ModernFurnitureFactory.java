package AbstractFactory;

public class ModernFurnitureFactory implements AbstractFactory{
    @Override
    public Furniture getFurniture(String furnitureType) {
        if(furnitureType.equals("chair")) {
            return new ModernChair();

        }else if(furnitureType.equals("table")) {
            return new ModernTable();
        }

        return null;
    }
}
