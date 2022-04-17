package main.java.ru.qaway.basic_java.lesson_02.task;

public class Task_01_3 {

    public static void main(String[] args) {
        int a = 2147483647; // 2^31 - 1
        int b = 1;

        long res = a + b;

        System.out.println(res);
    }
}

// -2147483648;;Ошибка компиляции;;2147483648;;0