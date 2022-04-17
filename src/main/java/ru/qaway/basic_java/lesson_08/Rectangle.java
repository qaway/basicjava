package main.java.ru.qaway.basic_java.lesson_08;

public class Rectangle {
    final double width;
    final double height;

    Rectangle() {
        this.width = 20;
        this.height = 10;
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height; // *1
    }

//    void setWidth(double width) {
//        this.width = width;
//    }
//
//    void setHeight(double height) {
//        this.height = height; // *2
//    }
}
