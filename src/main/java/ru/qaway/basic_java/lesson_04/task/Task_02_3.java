package main.java.ru.qaway.basic_java.lesson_04.task;

public class Task_02_3 {

    public static void main(String[] args) {
        int a = 5, b = 5;

        if (a > 5) {
            if (b > 5) {
                System.out.println(b - a);
            } else {
                System.out.println(b);
            }
        } else {
            if (b > 5) System.out.println(b + a);
        }
        System.out.println("end");
    }
}

// end;;14;;4;;4