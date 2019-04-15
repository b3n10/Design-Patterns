package com.animals;

public class NoRunner implements RunBehavior {
    @Override
    public void run() {
        System.out.println("I'm not a runner :(");
    }
}
