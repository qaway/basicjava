package main.java.ru.qaway.basic_java.lesson_03;

public class Lesson_03_3 {

    public static void main(String[] args) {
        int[][] matrix = new int[5][4]; // *1

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = i + j; // *2
                System.out.print(matrix[i][j] + " "); // *3
            }
            System.out.println();
        }
    }
}
