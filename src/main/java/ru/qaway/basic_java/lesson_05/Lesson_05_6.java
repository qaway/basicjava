package main.java.ru.qaway.basic_java.lesson_05;

public class Lesson_05_6 {

    public static void main(String[] args) {
        int[][] triangle = {
                {0 + 0, 0, 0, 0},
                {0 + 1, 1 + 1, 0, 0},
                {0 + 2, 1 + 2, 2 + 2, 0},
                {0 + 3, 1 + 3, 2 + 3, 3 + 3}
        };

        for (int[] array : triangle) {
            for (int elem : array) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
