package io.piano.statements;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter an integer number from 1 to 12 to display corresponding month");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not an integer number. Try again.");
                scanner.next();
            }number = scanner.nextInt();
        } while (number < 1 || number > 12 );


        if (number == 1) {
            System.out.println("It's January time!");
        } else if (number == 2) {
            System.out.println("It's February time!");
        } else if (number == 3) {
            System.out.println("It's March time!");
        } else if (number == 4) {
            System.out.println("It's April time!");
        } else if (number == 5) {
            System.out.println("It's May time!");
        } else if (number == 6) {
            System.out.println("It's June time!");
        } else if (number == 7) {
            System.out.println("It's July time!");
        } else if (number == 8) {
            System.out.println("It's August time!");
        } else if (number == 9) {
            System.out.println("It's September time!");
        } else if (number == 10) {
            System.out.println("It's October time!");
        } else if (number == 11) {
            System.out.println("It's November time!");
        } else if (number == 12) {
            System.out.println("It's December time!");
        }
    }
}
