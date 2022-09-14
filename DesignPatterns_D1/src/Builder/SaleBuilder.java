package Builder;

public class SaleBuilder {
    public CarSale createSmallCarSale() {
        CarSale smallCarSale = new CarSale();

        smallCarSale.addVehicle(new Car("Toyota", 1000.0f));
        smallCarSale.addVehicle(new Car("Honda", 2000.5f));

        smallCarSale.addVehicle(new Truck("GMC", 3000.5f));


        return smallCarSale;
    }

    public CarSale createLargeCarSale() {
        CarSale largeCarSale = new CarSale();

        largeCarSale.addVehicle(new Car("Mazda", 1000.0f));
        largeCarSale.addVehicle(new Car("Lexus", 2500.5f));
        largeCarSale.addVehicle(new Car("Subaru", 3100.5f));

        largeCarSale.addVehicle(new Truck("GMC", 3000.0f));
        largeCarSale.addVehicle(new Truck("Ford", 4600.5f));
        largeCarSale.addVehicle(new Truck("Chevy", 2600.0f));

        return largeCarSale;
    }
}
