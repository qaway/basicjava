package main.java.ru.qaway.basic_java.lesson_07;

public class lesson_07_4 {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(rectangle1);

        System.out.printf("Square1 = %s\n", rectangle1.square());
        System.out.printf("Square2 = %s\n", rectangle2.square());
        System.out.printf("Rectangle1 is equal to rectangle2 : %s\n\n", rectangle1.equalTo(rectangle2));

        rectangle2.reduce(rectangle2);
        System.out.printf("Square2 = %s\n", rectangle2.square());
        System.out.printf("Rectangle1 is equal to rectangle2 : %s\n\n", rectangle1.equalTo(rectangle2));
    }
}
