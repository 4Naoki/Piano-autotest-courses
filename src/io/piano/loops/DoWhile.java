package io.piano.loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        do {
            System.out.println("Guess the name of the Admin");
               name = scanner.next();
        } while (!name.equalsIgnoreCase("Nikita"));
        System.out.println("Finally you guessed it");
    }
}
