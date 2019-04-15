package com.gumballstate;

public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("No more gumballs!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No more gumballs!");
    }

    @Override
    public void turnCrank() {
        System.out.println("No more gumballs!");
    }

    @Override
    public void dispense() {
        System.out.println("No more gumballs!");
        gumballMachine.refill(5);
    }
}
