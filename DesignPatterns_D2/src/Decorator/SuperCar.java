package Decorator;

public class SuperCar extends CarDecorator{
    public SuperCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Changed into a supercar");
    }
}
