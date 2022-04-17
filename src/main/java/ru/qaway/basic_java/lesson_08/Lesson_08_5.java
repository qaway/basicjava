package main.java.ru.qaway.basic_java.lesson_08;

public class Lesson_08_5 {

    static void printArgs(String desc, int... args) {
        System.out.println(desc);
        System.out.println("Args count : " + args.length);

        for (int arg : args)
            System.out.printf("%s ", arg);

        System.out.println();
    }

    public static void main(String[] args) {
        printArgs("No args");
        printArgs("One arg", 1);
        printArgs("Four args", 1, 2, 3, 4);
    }
}
