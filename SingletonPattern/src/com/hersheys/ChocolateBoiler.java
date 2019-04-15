package com.hersheys;

public class ChocolateBoiler {
    private static ChocolateBoiler chocolateBoilerInstance;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (chocolateBoilerInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (chocolateBoilerInstance == null) {
                    chocolateBoilerInstance = new ChocolateBoiler();
                }
            }
        }
        return chocolateBoilerInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Filled the boiler.");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("Drained the boiler");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("Boiler now hot.");
        }
    }

    private boolean isEmpty() {
        return empty;
    }

    private boolean isBoiled() {
        return boiled;
    }
}
