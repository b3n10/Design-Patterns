package com.quackers;

public class PandanTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobbling turkey..");
    }

    @Override
    public void fly() {
        System.out.println("Flying turkey..");
    }
}
