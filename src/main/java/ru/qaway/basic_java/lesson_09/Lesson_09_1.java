package main.java.ru.qaway.basic_java.lesson_09;

public class Lesson_09_1 {

    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        ChildClass childClass = new ChildClass();

        System.out.println("parentClass:");
        parentClass.printXY();

        System.out.println("childClass:"); // *1
        childClass.printXZ();

        childClass.x = 40; // *2
        childClass.printXZ();

//        parentClass.printXY(); // *3
//        parentClass.y = 40;
    }
}
