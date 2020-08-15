package com.example.calc.util;

public abstract class AbstractUtils {

    public abstract int getNumber();

    public int add(int number) {
        return getNumber() + number;
    }
}
