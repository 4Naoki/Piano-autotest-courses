package io.piano.loops;

public class For {
    public static void main(String[] args) {
        String array[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        boolean containsWord = false;

        for (int i = 0; i < array.length; i++){
            if (array[i].equalsIgnoreCase("five")){
                containsWord = true;
                break;
            }
        }
        System.out.println(containsWord);
    }
}
