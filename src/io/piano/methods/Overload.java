package io.piano.methods;

import java.util.Arrays;
import java.util.Scanner;

public class Overload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many continents do you want to enter?");
        int number = scanner.nextInt();
        String[] array = new String[number];
        System.out.println("Enter the continents");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        sortContinents(array);
        sortContinents("Antarctica", "North America", "Africa", "Europe");
    }

    static void sortContinents(String array[]) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    static void sortContinents(String continent1,
                               String continent2) {
        String[] array = {continent1, continent2};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    static void sortContinents(String continent1,
                               String continent2,
                               String continent3) {
        String[] array = {continent1, continent2, continent3};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    static void sortContinents(String continent1,
                               String continent2,
                               String continent3,
                               String continent4) {
        String[] array = {continent1, continent2, continent3, continent4};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    static void sortContinents(String continent1,
                               String continent2,
                               String continent3,
                               String continent4,
                               String continent5) {
        String[] array = {continent1, continent2, continent3, continent4, continent5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    static void sortContinents(String continent1,
                               String continent2,
                               String continent3,
                               String continent4,
                               String continent5,
                               String continent6) {
        String[] array = {continent1, continent2, continent3, continent4, continent5, continent6};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    static void sortContinents(String continent1,
                          String continent2,
                          String continent3,
                          String continent4,
                          String continent5,
                          String continent6,
                          String continent7) {
        String[] array = {
                continent1,
                continent2,
                continent3,
                continent4,
                continent5,
                continent6,
                continent7};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

}
