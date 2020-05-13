package io.piano.classesobjects;

public class ClassesObjects {
    public static void main(String[] args) {
        MyName person = new MyName();
        person.name = "Nikita";
        person.surname = "Torkhov";

        person.sayHello(person.name, person.surname);
    }
}
