package com.animals;

public class NoGrowler implements GrowlBehavior {
    @Override
    public void growl() {
        System.out.println("I'm not a growler :(");
    }
}
