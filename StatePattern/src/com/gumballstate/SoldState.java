package com.gumballstate;

public class SoldState implements State {
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait for your gumball.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry can't eject quarter, crank already turned.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry, crank already turned.");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();

        if (gumballMachine.getCount() == 0) {
            System.out.println("NO MORE GUMBALLS!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }
}
