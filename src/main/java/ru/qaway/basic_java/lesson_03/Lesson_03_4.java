package main.java.ru.qaway.basic_java.lesson_03;

public class Lesson_03_4 {

    public static void main(String[] args) {
        int[][] triangle = {
                {0 + 0, 0, 0, 0},
                {0 + 1, 1 + 1, 0, 0},
                {0 + 2, 1 + 2, 2 + 2, 0},
                {0 + 3, 1 + 3, 2 + 3, 3 + 3}
        }; // *1

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();  // *2
        }
    }
}
