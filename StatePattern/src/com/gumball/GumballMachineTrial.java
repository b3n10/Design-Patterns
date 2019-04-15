package com.gumball;

public class GumballMachineTrial {
    private static int SOLD_OUT = 0;
    private static int NO_QUARTER = 1;
    private static int HAS_QUARTER = 2;
    private static int SOLD = 3;

    private int state = SOLD_OUT;
    private int count = 0;

    public GumballMachineTrial(int count) {
        this.count = count;
        if (this.count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Already has a quarter in.");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("Quarter is inserted!");
        } else if (state == SOLD) {
            System.out.println("Please wait for gumball to be dispensed.");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumballs available!");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            state = NO_QUARTER;
            System.out.println("Successfully ejected quarter!");
        } else if (state == NO_QUARTER || state == SOLD_OUT) {
            System.out.println("No quarter inserted, can't eject a quarter!");
        } else if (state == SOLD) {
            System.out.println("Gumball already sold! Can't refund quarter.");
        }
    }

    public void turnCrank() {
        if (state == HAS_QUARTER) {
            System.out.println("Successfully sold a gumball!");
            state = SOLD;
            dispense();
        } else if (state == NO_QUARTER) {
            System.out.println("Please pay first!");
        } else if (state == SOLD) {
            System.out.println("Please wait for gumball to be dispensed.");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumballs available!");
        }
    }

    private void dispense() {
        if (state == HAS_QUARTER) {
            System.out.println("No gumballs dispensed!");
        } else if (state == NO_QUARTER) {
            System.out.println("Pay first!");
        } else if (state == SOLD) {
            System.out.println("Gumball now dispensing..");
            count = count - 1;
            if (count == 0) {
                System.out.println("Gumballs sold out!");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == SOLD_OUT) {
            System.out.println("No gumballs available!");
        }
    }

    @Override
    public String toString() {
        return "\nMighty Gumball, Inc.\nJava-enabled Standing Gumball Model #2004\nInventory: " + count + " gumballs\nMachine is waiting for quarter\n";
    }
}
