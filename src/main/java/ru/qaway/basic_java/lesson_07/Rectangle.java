package main.java.ru.qaway.basic_java.lesson_07;

public class Rectangle {
    double width;
    double height;

    public Rectangle(Rectangle rectangle) {
        setWidth(rectangle.width);
        setHeight(rectangle.height);
    }

    public Rectangle() {
        setWidth(20);
        setHeight(10);
    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double square() {
        return width * height;
    }

    public boolean equalTo(Rectangle rectangle) {
        return rectangle.width == width && rectangle.height == height;
    }

    void reduce(Rectangle rectangle) {
        rectangle.width = rectangle.width / 2;
        rectangle.height = rectangle.height / 2;
    }
}
