package com.medievalarmy;

public class Troll extends Character {
    @Override
    void fight() {
        System.out.println("Wanna fight me with my " + weapon.useWeapon());
    }
}
