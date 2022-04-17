package main.java.ru.qaway.basic_java.lesson_03.task;

public class Task_01_3 {

    public static void main(String[] args) {
        int[] numbers; // *1
        numbers = new int[2]; // *2

        numbers[0] = 1;

        System.out.println("numbers[1] = " + numbers[1]);
    }
}

// 0;;Ошибка компиляции;;numbers[1];;1