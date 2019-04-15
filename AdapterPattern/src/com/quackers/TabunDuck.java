package com.quackers;

public class TabunDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Tabun Duck: Quack quack quack..");
    }

    @Override
    public void fly() {
        System.out.println("Tabun Duck: Fly fly fly..");
    }
}
