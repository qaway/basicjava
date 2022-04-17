package main.java.ru.qaway.basic_java.lesson_09;

public class Phone extends Device{

    public Phone(Phone phone) {
        super(phone);
    }

    public Phone(int price, float displaySize) {
        super(price, displaySize);
    }

    public void call() {
        System.out.println("Calling...");
    }
}
