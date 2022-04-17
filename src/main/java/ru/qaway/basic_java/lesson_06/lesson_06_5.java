package main.java.ru.qaway.basic_java.lesson_06;

public class lesson_06_5 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setWidth(20);
        rectangle.setHeight(10);

        System.out.printf("Square = %s", rectangle.square());
    }
}
