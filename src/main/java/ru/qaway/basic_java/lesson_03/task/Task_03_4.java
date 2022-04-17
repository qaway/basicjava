package main.java.ru.qaway.basic_java.lesson_03.task;

public class Task_03_4 {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                matrix[i][j] = i + j;
            }
        }

        System.out.println(matrix[0][2]);
    }
}

// 2;;Ошибка компиляции;;matrix[0][2];;0