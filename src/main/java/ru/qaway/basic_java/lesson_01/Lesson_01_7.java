package main.java.ru.qaway.basic_java.lesson_01;

public class Lesson_01_7 {

    public static void main(String[] args) {
        byte a;
        int b = 261;
        double c = 261.103;

        a = (byte) b;
        System.out.printf("Cast int to byte : (byte) %s = %s.\n", b, a);

        b = (int) c;
        System.out.printf("Cast double to int : (int) %s = %s.\n", c, b);

        a = (byte) c;
        System.out.printf("Cast double to byte : (byte) %s = %s.\n", c, a);
    }
}
