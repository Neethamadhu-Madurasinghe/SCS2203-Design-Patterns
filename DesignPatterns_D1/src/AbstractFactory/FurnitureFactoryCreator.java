package AbstractFactory;

public class FurnitureFactoryCreator {
    public static AbstractFactory getFactory(String factoryType) {
        if(factoryType.equals("victorian")) {
            return new VictorianFurnitureFactory();

        }else if(factoryType.equals("modern")) {
            return new ModernFurnitureFactory();
        }

        return null;
    }
}
