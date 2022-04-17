package main.java.ru.qaway.basic_java.lesson_03;

public class Lesson_03_1 {

    public static void main(String[] args) {
        int[] numbers; // *1
        numbers = new int[4]; // *2

        numbers[0] = 1;
        numbers[2] = 3;
        numbers[3] = 4;

        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[1] = " + numbers[1]); // *3
    }
}
