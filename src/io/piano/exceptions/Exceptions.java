package io.piano.exceptions;

import java.util.HashMap;
import java.util.Map;

public class Exceptions {
    public static void main(String[] args) {
        Library x = new Library();


        try {
            x.getBook("Sunset");
        } catch (LibException e) {

        }
    }

    public static class Library {
        private Map<String, String> books = new HashMap<>();


        public String getBook(String title) throws LibException {
            String s = books.get(title);
            if (s == null) {
                throw new LibException("no book");
            }
            return s;
        }
    }

    public static class LibException extends Exception {
        public LibException(String reason) {
            super(reason);
        }
    }
}
