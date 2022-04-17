package main.java.ru.qaway.basic_java.lesson_04.task;

public class Task_05_2 {

    public static void main(String[] args) {
        int a = 3, b = 2;

        switch (a) {
            case 1 : System.out.println("1");
            case 2 :
                switch (b) {
                    case 1 : System.out.println("2.1");
                    case 2 : System.out.println("2.2");
                }
//            case "3" : System.out.println("3");
        }
    }
}

// Ошибка компиляции;java: incompatible types: java.lang.String cannot be converted to int;;3;;2.2;;2.1;;1