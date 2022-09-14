import  Singleton.SingleObject;
import Factory.*;
import AbstractFactory.*;
import Builder.*;
import Prototype.*;

public class Main {
    public static void main(String[] args) {

    }

    public static void singletonDemo() {
        SingleObject ob1 = SingleObject.getInstance();
        ob1.sayHello();

        SingleObject ob2 = SingleObject.getInstance();
        ob2.sayHello();
    }
    public static void factoryDemo() {
        ShapeFactory myShapeFactory = new ShapeFactory();

        Shape sh = myShapeFactory.getShape("circle");
        sh.drawShape();

        sh = myShapeFactory.getShape("square");
        sh.drawShape();
    }
    public static void abstractFactoryDemo() {
        AbstractFactory victorianFactory = FurnitureFactoryCreator.getFactory("victorian");
        assert victorianFactory != null;
        Furniture victorianChair = victorianFactory.getFurniture("chair");
        victorianChair.useFurniture();
        Furniture victorianTable = victorianFactory.getFurniture("table");
        victorianTable.useFurniture();

        AbstractFactory modernFactory = FurnitureFactoryCreator.getFactory("modern");
        assert  modernFactory != null;
        Furniture modernChair = modernFactory.getFurniture("chair");
        modernChair.useFurniture();
        Furniture modernTable = modernFactory.getFurniture("table");
        modernTable.useFurniture();
    }
    public static void builderDemo() {
        SaleBuilder mySaleBuilder = new SaleBuilder();

        CarSale mySmallCarSale =mySaleBuilder.createSmallCarSale();
        System.out.println("Total value of cars in small car sale: " + mySmallCarSale.getTotalValue());
        mySmallCarSale.showVehicles();

        System.out.println();

        CarSale myLargeCarSale =mySaleBuilder.createLargeCarSale();
        System.out.println("Total value of cars in large car sale: " + myLargeCarSale.getTotalValue());
        myLargeCarSale.showVehicles();
    }
    public static void prototypeDemo() {
        Zoo.addAnimals();

        Animal clonedAnimal1 = Zoo.getAnimal("cat1");
        System.out.println("cat1: " + clonedAnimal1.makeSound());

        Animal clonedAnimal2 = Zoo.getAnimal("cat2");
        System.out.println("cat2: " + clonedAnimal2.makeSound());

        Animal clonedAnimal3 = Zoo.getAnimal("dog1");
        System.out.println("dog1: " + clonedAnimal3.makeSound());
    }
}