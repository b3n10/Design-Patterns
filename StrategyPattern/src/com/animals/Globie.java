package com.animals;

class Globie extends Dog {
    Globie() {
        r = new Runner();
        g = new Growler();
    }

    @Override
    void sleep() {
        System.out.println("I'm sleeping.");
    }
}
