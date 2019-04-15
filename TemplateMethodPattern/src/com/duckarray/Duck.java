package com.duckarray;

public class Duck implements Comparable {
    private int height;

    public Duck(int _height) {
        height = _height;
    }

    @Override
    public String toString() {
        return String.valueOf(height);
    }

    @Override
    public int compareTo(Object o) {
        Duck duck = (Duck) o;
        return this.height - duck.height;
    }
}
