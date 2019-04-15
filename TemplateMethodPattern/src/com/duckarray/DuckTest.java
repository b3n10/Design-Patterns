package com.duckarray;

import java.util.Arrays;

public class DuckTest {
    public static void main(String[] args) {
        Duck [] duckArray = {
                new Duck(8), new Duck(7), new Duck(9)
        };

        for (Duck duck : duckArray) {
            System.out.println(duck);
        }

        Arrays.sort(duckArray);

        for (Duck duck : duckArray) {
            System.out.println(duck);
        }
    }
}
