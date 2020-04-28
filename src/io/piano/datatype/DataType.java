package io.piano.datatype;

public class DataType {

    public static void main(String[] args) {

    byte b = Byte.parseByte("123");
    short s = Short.parseShort("456");
    int i = Integer.parseInt("789");
    long l = Long.parseLong("123");
    float f = Float.parseFloat("456.789");
    double d = Double.parseDouble("123.456");

    String string1 = Integer.toString(123);
    String string2 = Double.toString(123.43878);
    String string3 = Long.toString(45645646);
    String string4 = Float.toString(909123.432f);

    String string5 = Character.toString('u');
    String string6 = Character.toString(68);

    }
}
