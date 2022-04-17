package main.java.ru.qaway.basic_java.lesson_03.task;

public class Task_05_1 {

    public static void main(String[] args) {
        int[][] triangle = new int[4][];

        for (int i = 0; i < 4; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = i + j;
            }
        }

        System.out.print(triangle[0][1]);
    }
}

// Ошибка компиляции;Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1;;1;;0;;2