package main.java.ru.qaway.basic_java.lesson_08;

public class AccessModifiers {
    private int x1;
    public int x2;
    int x3; // *1

    void setX1(int val) {
        x1 = val;
    }

    int getX1() { // *2
        return x1;
    }
}
