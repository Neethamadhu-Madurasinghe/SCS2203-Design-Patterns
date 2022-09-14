package Builder;

public abstract class LightVehicle implements Vehicle{
    @Override
    public Suspention suspention() {
        return new CoilSpring();
    }

    @Override
     public abstract String model();

    @Override
    public abstract float price();
}
