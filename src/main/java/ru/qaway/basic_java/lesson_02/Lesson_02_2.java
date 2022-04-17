package main.java.ru.qaway.basic_java.lesson_02;

public class Lesson_02_2 {

    public static void main(String[] args) {
        // a*x^2 + b*x + c = 0
        int a = 1;
        int b = -1;
        int c = -6;

        double d = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);

        System.out.printf("x1 = %s, x2 = %s", x1, x2);
    }
}
