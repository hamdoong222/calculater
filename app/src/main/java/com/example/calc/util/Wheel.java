package com.example.calc.util;

public class Wheel implements InterfaceTest {
    private int air = 100;

    public Wheel(int air) {
        this.air = air;
    }

    public Wheel() {

    }

    public void setAir(int air) {
        this.air = air;
    }

    public int getAir() {
        return air;
    }


    @Override
    public int multiple(int a, int b) {
        return a*b;
    }

    @Override
    public int add(int a, int b) {
        return 0;
    }

    @Override
    public int move() {
        return 0;
    }
}
