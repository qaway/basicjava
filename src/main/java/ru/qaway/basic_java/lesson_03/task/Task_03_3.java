package main.java.ru.qaway.basic_java.lesson_03.task;

public class Task_03_3 {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                matrix[i][j] = i + j;
            }
        }

        System.out.println(matrix[2][0]);
    }
}

// 0;;Ошибка компиляции;;matrix[2][0];;2