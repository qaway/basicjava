package main.java.ru.qaway.basic_java.lesson_06;

public class lesson_06_7 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle2 = new Rectangle(20, 15);

        System.out.printf("Square1 = %s\n", rectangle.square());
        System.out.printf("Square2 = %s", rectangle2.square());
    }
}
