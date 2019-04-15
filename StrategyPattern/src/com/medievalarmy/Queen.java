package com.medievalarmy;

public class Queen extends Character {
    @Override
    void fight() {
        System.out.println("I'm fighting with a: " + weapon.useWeapon());
    }
}
