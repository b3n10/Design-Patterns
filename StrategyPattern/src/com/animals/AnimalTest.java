package com.animals;

public class AnimalTest {
    public static void main(String[] args) {
        Globie globie = new Globie();
        globie.performGrowl();
        globie.performRun();

        ModelDog modelDog = new ModelDog();
        modelDog.setGrowlBehavior(new NoGrowler());
        modelDog.performGrowl();
        modelDog.setRunBehavior(new RocketPoweredRunner());
        modelDog.performRun();
        modelDog.sleep();
    }
}
