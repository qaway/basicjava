package main.java.ru.qaway.basic_java.lesson_04.task;

public class Task_02_2 {

    public static void main(String[] args) {
        int a = 9, b = 5;

        if (a > 5) {
            if (b > 5) {
                System.out.println(b - a);
            } else {
                System.out.println(b);
            }
        } else {
            if (b > 5) System.out.println(b + a);
        }
    }
}

// 5;;14;;4;;b + a