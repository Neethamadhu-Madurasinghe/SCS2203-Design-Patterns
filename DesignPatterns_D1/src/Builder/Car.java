package Builder;

public class Car extends LightVehicle{
    String carModel;
    float price;

    Car(String carModel, float price) {
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
