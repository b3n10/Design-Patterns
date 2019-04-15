package com.quackers;

public class QuackerTest {
    public static void main(String[] args) {
        PandanTurkey pandanTurkey = new PandanTurkey();
        System.out.println("Pandan Turkey:");
        pandanTurkey.gobble();
        pandanTurkey.fly();

        Duck turkeyAdapter = new TurkeyAdapter(pandanTurkey);

        System.out.println("Tabun Duck:");
        testDuck(new TabunDuck());

        System.out.println("Pandan Turkey:");
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
