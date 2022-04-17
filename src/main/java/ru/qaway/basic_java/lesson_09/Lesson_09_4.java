package main.java.ru.qaway.basic_java.lesson_09;

public class Lesson_09_4 {

    public static void main(String[] args) {
        IPhone iPhone12 = new IPhone(969, 6.36f, 14);

        System.out.println("Iphone12: ");
        iPhone12.print();
        iPhone12.call();
    }
}
