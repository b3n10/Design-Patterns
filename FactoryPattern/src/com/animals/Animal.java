package com.animals;

public abstract class Animal {
    private String name;

    public void walk() {
        System.out.println(getName() + " is walking.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
