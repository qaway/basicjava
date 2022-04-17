package main.java.ru.qaway.basic_java.lesson_01;

public class Lesson_01_9 {

    public static void main(String[] args) {
        byte a = 20;
        char b = 'b';
        short c = 1000;
        int d = 2100;
        float e = 12.66f;
        double f = 2.430;

        double res = (e * a) + (d * b) - (f * c);
        System.out.println("(e * a) = " + (e * a));
        System.out.println("(d * b) = " + (d * b));
        System.out.println("(f * c) = " + (f * c));

        System.out.println("res = " + res);
    }
}
