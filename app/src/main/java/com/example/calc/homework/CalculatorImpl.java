package com.example.calc.homework;

public class CalculatorImpl implements Calculator {
    @Override
    public int subtract(int number, int number2) {
        return number - number2;
    }

    @Override
    public int add(int number, int number2) {
        return number + number2;
    }
}
