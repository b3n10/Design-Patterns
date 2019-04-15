package com.animals;

public class Growler implements GrowlBehavior {
    @Override
    public void growl() {
        System.out.println("I'm growling.");
    }
}
