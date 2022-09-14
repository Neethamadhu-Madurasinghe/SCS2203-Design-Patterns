package AbstractFactory;

public class VictorianFurnitureFactory implements AbstractFactory{
    @Override
    public Furniture getFurniture(String furnitureType) {
        if(furnitureType.equals("chair")) {
            return new VictorianChair();

        }else if(furnitureType.equals("table")) {
            return new VictorianTable();
        }

        return null;
    }
}
