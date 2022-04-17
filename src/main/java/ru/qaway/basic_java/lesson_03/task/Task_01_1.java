package main.java.ru.qaway.basic_java.lesson_03.task;

public class Task_01_1 {

    public static void main(String[] args) {
        int[] numbers; // *1
        numbers = new int[2]; // *2

        numbers[0] = 1;

        System.out.println("numbers[0] = " + numbers[0]);
    }
}

// 1;;Ошибка компиляции;;numbers[0];;0