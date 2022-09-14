package Prototype;

public abstract class Animal implements Cloneable  {
    String type;
    abstract public String makeSound();

    @Override
    public Object clone() {
        Object clonedObject = null;

        try {
            clonedObject = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return clonedObject;
    }
}
