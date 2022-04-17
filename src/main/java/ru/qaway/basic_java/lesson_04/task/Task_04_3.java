package main.java.ru.qaway.basic_java.lesson_04.task;

public class Task_04_3 {

    public static void main(String[] args) {
        int a = 1;

        switch (a) {
            case 1 : System.out.println("Monday");
                break;
            case 2 : System.out.println("Tuesday");
                break;
            case 3 : System.out.println("Wednesday");
                break;
            case 4 : System.out.println("Thursday");
                break;
            case 5 : System.out.println("Friday");
                break;
            case 6 : System.out.println("Saturday");
                break;
//            case "7" : System.out.println("Sunday");
//                break;
            default: System.out.println("Error");
        }
    }
}

// Ошибка компиляции;java: incompatible types: java.lang.String cannot be converted to int;;Monday;;Wednesday;;Error