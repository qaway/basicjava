package main.java.ru.qaway.basic_java.lesson_06;

public class lesson_06_2 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        rectangle.height = 10;
        rectangle.width = 20;

        rectangle2.height = 50;
        rectangle2.width = 100;

        double square = rectangle.width * rectangle.height;
        double square2 = rectangle2.width * rectangle2.height;

        System.out.printf("Square1 = %s, Square2 = %s", square, square2);
    }
}
