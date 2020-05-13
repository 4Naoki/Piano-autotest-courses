package io.piano.abstractclasses;

public class Square extends Figures {

    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double getArea(int a) {
        return a * a;
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
