package com.gumball;

public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarter inserted!");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turned crank, but no quarter inserted!");
    }

    @Override
    public void dispense() {
        System.out.println("Please insert quarter first!");
    }
}
