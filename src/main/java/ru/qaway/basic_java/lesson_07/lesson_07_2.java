package main.java.ru.qaway.basic_java.lesson_07;

public class lesson_07_2 {

    public static void main(String[] args) {
        Math math = new Math();

        int a = 2, b = 3, c = 4;
        long d = 10, e = 20, f = 8;

        System.out.printf("math.sum(a, b) = %s.\n", math.sum(a, b));
//        System.out.printf("math.sum(a, b, c) = %s.\n", math.sum(a, b, c));
        System.out.printf("math.sum(d, e) = %s.\n", math.sum(d, e));
//        System.out.printf("math.sum(d, e, f) = %s.\n", math.sum(d, e, f));
    }
}
