package Decorator;

public class HyperCar extends CarDecorator{
    public HyperCar(SuperCar superCar) {
        super(superCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Changed into a Hyper car");
    }
}
