package main.java.ru.qaway.basic_java.lesson_08;

public class Lesson_08_6 {

    static void printArgs(String description, int... args) {
        System.out.println("Description: " + description);
        printArgs(args);
    }

    static void printArgs(int... args) {
        System.out.println("(int...) args count = " + args.length);

        for (int arg : args)
            System.out.printf("%s ", arg);

        System.out.println();
    }

//    static void printArgs(int arg1, int... args) {
//        System.out.println("(int...) args count = " + args.length);
//
//        for (int arg : args)
//            System.out.printf("%s ", arg);
//
//        System.out.println();
//    }

    static void printArgs(boolean... args) {
        System.out.println("(boolean...) args count = " + args.length);

        for (boolean arg : args)
            System.out.printf("%s ", arg);

        System.out.println();
    }

    static void printArgs(int arg) {
        System.out.printf("(int) args count = 1\n%s\n\n", arg);
    }

    public static void main(String[] args) {
        printArgs("No args");
        printArgs(1);
        printArgs(1, 2, 3, 4);
        printArgs(true, false, true);
//        printArgs();
    }
}
