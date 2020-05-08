package io.piano.collections.set;

import java.util.*;

public class SetTask {
    public static void main(String[] args) {
        List<String> listCollection = new ArrayList<>(Arrays.asList(
                "Яблоко", "Апельсин", "Груша", "Мандарин", "Банан",
                "Яблоко", "Апельсин", "Груша", "Мандарин", "Банан"));

        for (String element : listCollection) {
            System.out.println(element);
        }

        Iterator<String> iterator = listCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<String> setCollection = new HashSet<>(listCollection);

        if (setCollection.size() < listCollection.size()) {
            System.out.println("There are duplicates in list");
        } else
            System.out.println("List has no duplicates");
    }

}
