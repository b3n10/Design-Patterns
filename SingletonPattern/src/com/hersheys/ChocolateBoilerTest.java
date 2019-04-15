package com.hersheys;

public class ChocolateBoilerTest {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getInstance();
        ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();

        chocolateBoiler1.fill();
        chocolateBoiler2.boil();
        chocolateBoiler1.boil();
        chocolateBoiler2.fill();
        chocolateBoiler1.drain();
        chocolateBoiler2.drain();
    }
}
