package io.piano.classesobjects;

public class MyName {
    public String name;
    public String surname;

    public MyName(){

    }
    public MyName(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void sayHello(String name, String surname) {
        System.out.println("Greetings, " + this.name + " " + this.surname + "!");
    }
}

