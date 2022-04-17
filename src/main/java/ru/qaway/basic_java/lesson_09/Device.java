package main.java.ru.qaway.basic_java.lesson_09;

public class Device {
    private int price;
    float displaySize;

    public Device(Device device) {
        price = device.price;
        displaySize = device.displaySize;
    }

    public Device(int price, float displaySize) {
        this.price = price;
        this.displaySize = displaySize;
    }

    public void print() {
        System.out.println("Price : " + price);
        System.out.println("DisplaySize : " + displaySize); // *3
    }
}
