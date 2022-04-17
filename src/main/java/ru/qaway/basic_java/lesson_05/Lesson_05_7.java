package main.java.ru.qaway.basic_java.lesson_05;

public class Lesson_05_7 {

    public static void main(String[] args) {
        int i = 0;

        while (i < 20) {
            System.out.println(i);

            if (i++ == 7)
                break;
        }
    }
}
