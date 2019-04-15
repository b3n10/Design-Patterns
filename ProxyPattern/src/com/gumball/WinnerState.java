package com.gumball;

public class WinnerState implements State {
    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
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
        System.out.println("WINNER! Two gumballs for you.");
        gumballMachine.releaseBall();

        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
