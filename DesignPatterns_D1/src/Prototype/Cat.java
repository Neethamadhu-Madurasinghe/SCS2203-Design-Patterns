package Prototype;

public class Cat extends Animal{
    public Cat() {
        this.type = "Cat";
    }
    @Override
    public String makeSound() {
        return this.type + " => Meow";
    }
}
