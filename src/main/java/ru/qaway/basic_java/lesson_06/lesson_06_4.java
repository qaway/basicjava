package main.java.ru.qaway.basic_java.lesson_06;

public class lesson_06_4 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle2 = rectangle;

        rectangle.height = 10;
        rectangle.width = 20;

        rectangle2.height = 50;
        rectangle2.height = 100;

        double square = rectangle.height * rectangle.width;
        double square2 = rectangle2.height * rectangle2.width;

        System.out.printf("Square1 = %s, Square2 = %s", square, square2);
    }
}
