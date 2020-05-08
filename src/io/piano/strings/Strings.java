package io.piano.strings;

public class Strings {
    public static void main(String[] args) {
        String string1 = " Добро%пожаловать%на%курс%автоматизации ";
        String string2 = new String("ДОБРО ПОЖАЛОВАТЬ НА КУРС АВТОМАТИЗАЦИИ ");

        string1 = string1.substring(1, string1.length() - 1);
        string2 = string2.substring(0, string2.length() - 1);

        string1 = string1.replaceAll("%", " ");

        System.out.println("Are lines equal? " + string1.equalsIgnoreCase(string2));

        System.out.println("Index of авто is " + string1.indexOf("авто"));
        System.out.println("Char at 6th position is " + string2.charAt(6));

        }
    }

