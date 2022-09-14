package Prototype;

public class Dog extends Animal{
    public Dog() {
        this.type = "Dog";
    }
    @Override
    public String makeSound() {
        return this.type + " => Woof";
    }
}
