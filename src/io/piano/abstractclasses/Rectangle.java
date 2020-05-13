package io.piano.abstractclasses;

public class Rectangle extends Figures {

    int a;
    int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double getArea(int a) {
        return 0;
    }

    @Override
    public double getArea(int a, int b) {
        return a * b;
    }

    @Override
    public double getArea(int a, int b, int c) {
        return 0;
    }
}
