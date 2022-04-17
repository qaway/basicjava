package main.java.ru.qaway.basic_java.lesson_08;

public class StaticRectangle {
    static double length = 20;
    static double height = 10;

    static double square; // *1

    static {
        square = length * height;

        System.out.println("Static initialization - complete."); // *2
    }

    static void printSquare() {
        System.out.printf("Square = %s.\n\n", square); // *3
    }
}
