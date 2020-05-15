package io.piano.interfaces;

public class Triangle implements Figures {

    int a;
    int b;
    int c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public double getArea(int a) {
        return 0;
    }

    @Override
    public double getArea(int a, int b) {
        return 0;
    }

    @Override
    public double getArea(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            int s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        } else
            return 0;
    }
}
