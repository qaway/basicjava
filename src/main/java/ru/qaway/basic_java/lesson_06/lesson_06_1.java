package main.java.ru.qaway.basic_java.lesson_06;

public class lesson_06_1 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.height = 10;
        rectangle.width = 20;

        double square = rectangle.width * rectangle.height;
        System.out.println("Square = " + square);
    }
}
