package com.animals;

public class LandAnimalFactory implements AnimalFactory {
    public Animal createAnimal(String type) {
        if (type.equals("dog")) {
            return new Dog("Globie");
        }
        return null;
    }
}
