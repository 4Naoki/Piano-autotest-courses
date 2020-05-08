package io.piano.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTask {
    public static void main(String[] args) {

        String[] array = {"Слива", "Грецкий орех", "Инжир", "Груша", "Вишня", "Айва", "Абрикос", "Яблоня"};

        List<String> list = new ArrayList<>(Arrays.asList(array));

        for (String element : array) {
            System.out.println(element);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        list.stream().sorted().forEach(System.out::println);

        list.set(1, "Арбуз");
        System.out.println(list.contains("Арбуз"));
        System.out.println(list.contains("Грецкий орех"));

        System.out.println();

        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
    }

}
