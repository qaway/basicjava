package main.java.ru.qaway.basic_java.lesson_07;

public class lesson_07_3 {

    public static void main(String[] args) {
        Math math = new Math();

        byte a = 2, b = 3; // *1
        int c = 4;
        long d = 10;

        System.out.printf("math.sum(a, b) = %s\n", math.sum(a, b)); // *2
        System.out.printf("math.sum(a, c) = %s\n", math.sum(a, c)); // *3
        System.out.printf("math.sum(a, d) = %s\n", math.sum(a, d));
        System.out.printf("math.sum(c, d) = %s\n", math.sum(c, d)); // *4
    }
}
