package Prototype;

import java.util.HashMap;
import java.util.Hashtable;

public class Zoo {
    private static HashMap<String, Animal> animals= new HashMap<String, Animal>();

    public static Animal getAnimal(String id) {
        Animal storedAnimal = animals.get(id);
        return (Animal) storedAnimal.clone();
    }

    public static void addAnimals() {
        animals.put("dog1", new Dog());
        animals.put("dog2", new Dog());
        animals.put("cat1", new Cat());
        animals.put("cat2", new Cat());
    }
}
