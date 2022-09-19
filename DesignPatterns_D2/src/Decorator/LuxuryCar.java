package Decorator;

public class LuxuryCar extends CarDecorator {
   public LuxuryCar(Car car) {
       super(car);
   }

   @Override
   public void assemble() {
       super.assemble();
       System.out.println("Changed the car into a luxury car");
   }
}
