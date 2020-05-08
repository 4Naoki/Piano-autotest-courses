package io.piano.loops;

public class While {
    public static void main(String[] args) {
        int n = 10;
        while (n != -1) {
            System.out.println(n + " sec till launch");
            n--;
        }
        System.out.print("Launch: Let's go!");
    }
}
