package io.piano.interfaces;

import io.piano.abstractclasses.Rectangle;
import io.piano.abstractclasses.Square;
import io.piano.abstractclasses.Triangle;

public class Interfaces {
    public static void main(String[] args) {
        String[] array = {"Triangle", "Square", "Rectangle"};

        for (String e : array) {
            switch (e) {
                case "Rectangle":
                    io.piano.abstractclasses.Rectangle rectangle = new Rectangle();
                    rectangle.setA(5);
                    rectangle.setB(6);
                    System.out.println(rectangle.getArea(rectangle.getA(), rectangle.getB()));
                    break;
                case "Square":
                    io.piano.abstractclasses.Square square = new Square();
                    square.setA(6);
                    System.out.println(square.getArea(square.getA()));
                    break;
                case "Triangle":
                    io.piano.abstractclasses.Triangle triangle = new Triangle();
                    triangle.setA(10);
                    triangle.setB(6);
                    triangle.setC(10);
                    System.out.println(triangle.getArea(triangle.getA(), triangle.getB(), triangle.getC()));
                    break;
            }
        }
    }

}
