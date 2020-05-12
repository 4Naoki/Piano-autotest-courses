package io.piano.collections.map;

import java.util.*;

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

//        Второе задание
        String[] weekDays =
                {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        String[] yearSeasons =
                {"Зима", "Весна", "Лето", "Осень"};

        HashMap<String, ArrayList<String>> mapWithListAsValue =
                new HashMap<String, ArrayList<String>>();

        mapWithListAsValue.put("Дни", new ArrayList<>(Arrays.asList(weekDays)));
        mapWithListAsValue.put("Сезоны", new ArrayList<>(Arrays.asList(yearSeasons)));

        System.out.println();
        Iterator<Map.Entry<String, ArrayList<String>>> iterator =
                mapWithListAsValue.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, ArrayList<String>> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
