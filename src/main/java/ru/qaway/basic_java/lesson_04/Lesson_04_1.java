package main.java.ru.qaway.basic_java.lesson_04;

public class Lesson_04_1 {

    public static void main(String[] args) {
        int a = 10, b = 6;

        if (a > b)
            System.out.println("a > b"); // *1

        boolean res = (a == b);

        if (res) { // *2
            System.out.println("a == b");
        } else {
            System.out.println("a != b");
        }
    }
}
