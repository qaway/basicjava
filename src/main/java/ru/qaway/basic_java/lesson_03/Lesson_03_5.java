package main.java.ru.qaway.basic_java.lesson_03;

public class Lesson_03_5 {

    public static void main(String[] args) {
        int[][] triangle = new int[4][]; // *1

        for (int i = 0; i < 4; i++) {
            triangle[i] = new int[i + 1]; // *2
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = i + j; // *3
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
