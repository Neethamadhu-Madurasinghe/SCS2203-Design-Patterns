package Builder;

public class Truck extends  HeavyVehicle{
    String carModel;
    float price;

    Truck(String carModel, float price) {
        this.carModel = carModel;
        this.price = price;
    }
    @Override
    public String model() {
        return this.carModel;
    }

    @Override
    public float price() {
        return this.price;
    }
}
