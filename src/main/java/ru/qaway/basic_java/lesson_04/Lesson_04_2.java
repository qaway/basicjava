package main.java.ru.qaway.basic_java.lesson_04;

public class Lesson_04_2 {

    public static void main(String[] args) {
        int a = 10, b = 6;
        int c;

        if (a > 5) {
            if (b > 8)
                c = 1;
            if (b <= 8)
                c = a;
            else
                c = b;
        } else {
            c = 12;
        }

        System.out.println("c = " + c);
    }
}
