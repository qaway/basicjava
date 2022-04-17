package main.java.ru.qaway.basic_java.lesson_02.task;

public class Task_01_6 {

    public static void main(String[] args) {
        int res = 0;

        System.out.println((byte)(200));
        for (byte i = 1; i <= 200; i++) {
            res = i;
        }

        System.out.println(res);
    }
}

// Бесконечный цикл; ;;200;;-56;;Ошибка компиляции