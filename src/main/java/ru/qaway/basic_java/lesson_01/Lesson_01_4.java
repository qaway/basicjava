package main.java.ru.qaway.basic_java.lesson_01;

public class Lesson_01_4 {

    public static void main(String[] args) {
//        a = 10;
        int a = 20; // *1

        for (int i = 0; i < 4; i++) {
            int b = 10; // *2
            System.out.println("b = " + b);

            b = i;
            System.out.println("i = " + i + ", b = " + b);

//            int a; // *3
        }
    }
}
