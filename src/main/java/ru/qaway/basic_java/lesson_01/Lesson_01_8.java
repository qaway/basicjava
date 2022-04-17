package main.java.ru.qaway.basic_java.lesson_01;

public class Lesson_01_8 {

    public static void main(String[] args) {
        byte a = 50;
        byte b = 30;
        byte c = 20;

        int d = a * b / c;
        System.out.println("d = " + d);

//        a = a * 2;
        a = (byte) (a * 2);
    }
}
