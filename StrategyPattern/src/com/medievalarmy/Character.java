package com.medievalarmy;

abstract class Character {
    protected Weapon weapon;

    abstract void fight();

    protected void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
