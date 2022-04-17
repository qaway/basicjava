package main.java.ru.qaway.basic_java.lesson_03.task;

public class Task_05_3 {

    public static void main(String[] args) {
        int[][] triangle = new int[3][];

        for (int i = 0; i < 3; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < i; j++) {
                triangle[i][j] = i + j;
            }
        }

        System.out.print(triangle[0][0]);
    }
}

// 0;;Ошибка компиляции;;;1;;2