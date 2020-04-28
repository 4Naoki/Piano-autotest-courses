package io.piano.arrays;

public class Arrays {

    public static void main(String[] args) {

//        Первое задание
        double[] arr = {1.2, 3.6, 1.3, -5.5, 4.8, 8.1, 7.5, 6.5};
        double max = 0;
        double min = 0;

        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else
                System.out.print(arr[i] + ", ");
        }

        System.out.print("Array in desc: ");
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
            if (arr[j] > arr[j+1]) {
                double k = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = k;
                }
            } System.out.print(arr[i] + "  ");
        }
        System.out.println();

        System.out.print("Array in asc: ");
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j+1]) {
                    double k = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = k;
                }
            } System.out.print(arr[i] + "  ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
               max = arr[i];
            } else if (arr[i] < min)
               min = arr[i];
        }
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
        System.out.println();

//        Второе задание
        int[] array1 = {2,1,0,50,30,20,10};
        int[] array2 = {2,1,0,30,30,20,40};
        boolean arraysAreEqual = true;
        boolean arraysHaveMatchingElements = false;

        for (int i = 0; i < array2.length; i++) {
            if (array1[i] != array2[i]) {
                arraysAreEqual = false;
                break;
            }
        }

//      Это решение корректно, если нужно сравнить элементы первого массива со всеми элементами второго
//      Если нужно сравнить элементы с одинаковыми индексами, то второй цикл убирается

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[j] == array2[i]) {
                    System.out.println("Matching value on " + i + " and " +
                            j + " indexes with value: "+ array1[j]);
                    arraysHaveMatchingElements = true;
                }
            }
        }

        System.out.println();
        System.out.println("Are arrays equal in second task? -" + arraysAreEqual);
        System.out.println("Do arrays have matching elements? -" + arraysHaveMatchingElements);
    }
}
