package Builder;

public abstract class HeavyVehicle implements Vehicle{
    @Override
    public Suspention suspention() {
        return new LeafSpring();
    }

    @Override
    public abstract String model();

    @Override
    public abstract float price();
}
