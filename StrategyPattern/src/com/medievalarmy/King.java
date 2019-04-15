package com.medievalarmy;

public class King extends Character {
    @Override
    void fight() {
        System.out.println("Let's battle with my " + weapon.useWeapon());
    }
}
