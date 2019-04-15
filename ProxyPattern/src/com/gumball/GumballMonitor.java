package com.gumball;

public class GumballMonitor {
    private GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("GUMBALL INFO:");
        System.out.println("Count: " + gumballMachine.getCount());
        System.out.println("Location" + gumballMachine.getLocation());
    }
}
