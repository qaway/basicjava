package main.java.ru.qaway.basic_java.lesson_02;

public class Lesson_02_1 {

    public static void main(String[] args) {
        int china = 1442965000;
        int india = 1381790000;

        int resInt = china + india;
        long resLong = (long)china + india;

        System.out.println("resInt = " + resInt);
        System.out.println("resLong = " + resLong);
    }
}
