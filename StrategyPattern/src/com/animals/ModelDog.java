package com.animals;

public class ModelDog extends Dog {
    public ModelDog() {
        r = new NoRunner();
        g = new Growler();
    }

    @Override
    void sleep() {
        System.out.println("No plans to sleep");
    }
}
