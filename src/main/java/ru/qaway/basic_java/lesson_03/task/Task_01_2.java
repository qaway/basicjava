package main.java.ru.qaway.basic_java.lesson_03.task;

public class Task_01_2 {

    public static void main(String[] args) {
        int[] numbers; // *1
        numbers = new int[2]; // *2

        numbers[0] = 1;

        System.out.println("numbers[2] = " + numbers[2]);
    }
}

// Ошибка компиляции;Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2;;1;;numbers[2];;0