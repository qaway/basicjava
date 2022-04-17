package main.java.ru.qaway.basic_java.lesson_09;

public class IPhone extends Phone {
    private int osVersion; // *1

    public IPhone(IPhone iPhone) {
        super(iPhone);
        this.osVersion = iPhone.osVersion;
    }

    public IPhone(int price, float displaySize, int osVersion) {
        super(price, displaySize);
        this.osVersion = osVersion; // *2
    }

    public void print() { // *3
        super.print();
        System.out.println("osVersion : " + osVersion);
    }
}
