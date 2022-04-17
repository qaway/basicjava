package main.java.ru.qaway.basic_java.lesson_03.task;

public class Task_03_1 {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = i + j;
            }
        }

        System.out.println(matrix[3][3]);
    }
}

// Ошибка компиляции;Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3;;6;;matrix[3][3];;0