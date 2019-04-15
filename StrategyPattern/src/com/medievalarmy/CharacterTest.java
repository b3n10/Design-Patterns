package com.medievalarmy;

public class CharacterTest {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.setWeapon(new KnifeBehavior());
        queen.fight();

        King king = new King();
        king.setWeapon(new AxeBehavior());
        king.fight();

        Troll troll = new Troll();
        troll.setWeapon(new BalloonBehavior());
        troll.fight();
    }
}
