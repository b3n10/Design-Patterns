package com.animals;

public class AnimalFactoryTest {
    public static void main(String[] args) {
        LandAnimalFactory landAnimalFactory = new LandAnimalFactory();
        Animal animal = landAnimalFactory.createAnimal("dog");
        animal.walk();
    }
}
