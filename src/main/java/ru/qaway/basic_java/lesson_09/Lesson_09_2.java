package main.java.ru.qaway.basic_java.lesson_09;

public class Lesson_09_2 {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();

        System.out.println("childClass:");
        childClass.printXY();

        childClass.x = 30; // *1

        ParentClass parentClass = childClass;

        System.out.println("parentClass:");
        System.out.println("x: " + parentClass.x);
        parentClass.printXY(); // *2

//        parentClass.printXZ();
//        parentClass.z = 10; // *3
    }
}
