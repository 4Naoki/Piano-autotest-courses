package io.piano.statements;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println
                    ("Enter an integer number from 1 to 12 to display number of days in corresponding month");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not an integer number. Try again.");
                scanner.next();
            }number = scanner.nextInt();
        } while (number < 1 || number > 12 );

        switch (number) {
            case 1:
                System.out.println("There are 31 days in January");
                break;
            case 2:
                System.out.println("There are 28 or 29 days in February");
                break;
            case 3:
                System.out.println("There are 31 days in March");
                break;
            case 4:
                System.out.println("There are 30 days in April");
                break;
            case 5:
                System.out.println("There are 31 days in May");
                break;
            case 6:
                System.out.println("There are 30 days in June");
                break;
            case 7:
                System.out.println("There are 31 days in July");
                break;
            case 8:
                System.out.println("There are 31 days in August");
                break;
            case 9:
                System.out.println("There are 30 days in September");
                break;
            case 10:
                System.out.println("There are 31 days in October");
                break;
            case 11:
                System.out.println("There are 30 days in November");
                break;
            case 12:
                System.out.println("There are 31 days in December");
                break;
        }
    }
}
