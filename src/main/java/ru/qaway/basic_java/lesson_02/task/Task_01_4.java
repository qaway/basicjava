package main.java.ru.qaway.basic_java.lesson_02.task;

public class Task_01_4 {

    public static void main(String[] args) {
        int x = 2147483647; // 2^31 - 1
        int y = 1;

        long res = x + (long)y;

        System.out.println(res);
    }
}

// 2147483648;;-2147483648;;Ошибка компиляции;;0