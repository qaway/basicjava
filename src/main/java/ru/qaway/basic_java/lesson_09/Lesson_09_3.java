package main.java.ru.qaway.basic_java.lesson_09;

public class Lesson_09_3 {

    public static void main(String[] args) {
        Phone phone = new Phone(949, 6.46f);
        Phone clonedPhone = new Phone(phone);
        clonedPhone.displaySize = 6.11f;

        System.out.println("Phone: ");
        phone.print();

        System.out.println("Cloned phone: ");
        clonedPhone.print();

        IPhone iPhone12 = new IPhone(969, 6.36f, 14);
        IPhone clonedIphone = new IPhone(iPhone12);
        clonedIphone.displaySize = 6.12f;

        System.out.println("Iphone12: ");
        iPhone12.print();

        System.out.println("Cloned Iphone: ");
        clonedIphone.print();
    }
}
