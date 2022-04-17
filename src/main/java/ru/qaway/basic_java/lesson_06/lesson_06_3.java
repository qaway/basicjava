package main.java.ru.qaway.basic_java.lesson_06;

public class lesson_06_3 {

    public static void main(String[] args) {
        Rectangle rectangle;
        rectangle = new Rectangle();

        rectangle.height = 10;
        rectangle.width = 20;

        double square = rectangle.height * rectangle.width;
        System.out.printf("Square = %s", square);
    }
}
