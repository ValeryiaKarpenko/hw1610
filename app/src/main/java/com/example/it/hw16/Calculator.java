package com.example.it.hw16;

/**
 * Created by IT on 26.10.2017.
 */

public class Calculator implements ICalculator {

    @Override
    public String add(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return format(sum);
    }

    private String format(int value) {
        return String.valueOf(value);
    }

    @Override
    public String multiply(int... values) {
        return null;
    }

    @Override
    public String evaluate(String value) {
        return "3";
    }
}
