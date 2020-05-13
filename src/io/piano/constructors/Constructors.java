package io.piano.constructors;

import io.piano.classesobjects.MyName;

public class Constructors {
    public static void main(String[] args) {
        MyName person = new MyName("Nikita", "Torkhov");
        person.sayHello(person.name, person.surname);
    }

}
