package io.piano.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {
        String season = "";
        String[] array = {"Январь","Февраль","Март","Апрель","Май", "Июнь",
                        "Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(i + 1, array[i]);
        }

        for (Integer key: map.keySet()) {
            if (key >= 3 && key <= 5) {
                season = "весна";
            } else if (key >= 6 && key <= 8) {
                season = "лето";
            } else if (key >= 9 && key <= 11) {
                season = "осень";
            } else if (key >= 1 && key <= 2 || key == 12) {
                season = "зима";
            }
            System.out.println(key + " " + map.get(key) + " - это " + season);
        }

        System.out.println(map.containsKey(9));
        System.out.println(map.containsValue("Ноябрь"));
    }

}
