package io.piano.collections.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTask {
    public static void main(String[] args) {
        String[] array = {"Слива", "Грецкий орех", "Инжир", "Груша", "Вишня", "Айва", "Абрикос", "Яблоня"};
        List<String> list = new ArrayList<>(Arrays.asList(array));

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
