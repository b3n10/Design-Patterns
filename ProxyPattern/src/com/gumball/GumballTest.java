package com.gumball;

public class GumballTest {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine("Angeles City", 5);
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMonitor.report();
    }
}
