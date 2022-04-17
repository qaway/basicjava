package main.java.ru.qaway.basic_java.lesson_08;

public class Lesson_08_1 {

    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();

//        accessModifiers.x1;
        accessModifiers.setX1(3); // *1

        accessModifiers.x2 = 5;
        accessModifiers.x3 = 6; // *2

        System.out.printf("x1 = %s, x2 = %s, x3 = %s", accessModifiers.getX1(),
                accessModifiers.x2, accessModifiers.x3); // *3
    }
}
