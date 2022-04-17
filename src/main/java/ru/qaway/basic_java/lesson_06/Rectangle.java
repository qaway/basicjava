package main.java.ru.qaway.basic_java.lesson_06;

public class Rectangle {
    double width;
    double height;

    Rectangle() {
        setWidth(20);
        setHeight(10);
    }

    Rectangle(double w, double h) {
        setWidth(w);
        setHeight(h);
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    double square() {
        return width * height;
    }
}
