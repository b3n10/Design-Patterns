package com.gumballstate;

public class GumballMachine {
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    private State winnerState;

    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(int numberOfGumballs) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        this.count = numberOfGumballs;
        if (numberOfGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("Gumball rolling to the slot..");
        if (count != 0) {
            count--;
        }
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public int getCount() {
        return count;
    }

    public String toString() {
        return "\nMighty Gumball, Inc."
                + "\nJava-enabled Standing Gumball Model #2004"
                + "\nInventory: " + count
                + " gumballs\nMachine is waiting for quarter\n";
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void refill(int numberOfGumballs) {
       this.count = numberOfGumballs;
       state = noQuarterState;
    }
}
