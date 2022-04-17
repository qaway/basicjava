package main.java.ru.qaway.basic_java.lesson_04;

public class Lesson_04_5 {

    public static void main(String[] args) {
        int a = 2, b = 1;

        switch (a) {
            case 1 :
                System.out.println("1");
                break;
            case 2 :
                switch (b) {
                    case 1 :
                        System.out.println("2.1");
                        break;
                    case 2 :
                        System.out.println("2.2");
                        break;
                }
                break;
            case 3 :
                System.out.println("3");
                break;
        }
    }
}
