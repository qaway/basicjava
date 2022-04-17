package main.java.ru.qaway.basic_java.lesson_08;

public class OuterClass {
    int x = 10; // *1

    class InnerClass {
        int y = 20;

        void print() { // *2
            System.out.printf("x = %s\n", x);
            System.out.printf("y = %s", y);
        }
    }

    void run() {
        InnerClass innerClass = new InnerClass();

        innerClass.print(); // *3
    }

    void print() {
        System.out.printf("x = %s", x);
//        System.out.printf("y = %s", y);
    }
}
