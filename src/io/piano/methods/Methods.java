package io.piano.methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        greetByName();
        System.out.println("Name your three favourite movies");
        displayMovies();
    }

    static void greetByName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Nice to meet you, " + name + "!");
    }

    static void displayMovies() {
        Scanner scanner = new Scanner(System.in);
        String firstMovie = scanner.nextLine();
        String secondMovie = scanner.nextLine();
        String thirdMovie = scanner.nextLine();
        System.out.println("Oh, i really liked the first one - \"" +
                firstMovie + "\", but these two: \"" +
                secondMovie + "\" and \"" +
                thirdMovie + "\" i haven't actually seen :(");
    }
}
