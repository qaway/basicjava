package main.java.ru.qaway.basic_java.lesson_04.task;

public class Task_03_2 {

    public static void main(String[] args) {
        int a = 13;

        if (a == 12 || a == 1 || a == 2)  {
            System.out.println("Winter");
        } else if (a == 3 || a == 4 || a == 5) {
            System.out.println("Spring");
        } else if (a == 6 || a == 7 || a == 8) {
            System.out.println("Summer");
        } else if (a == 9 || a == 10 || a == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Error");
        }
    }
}

// Error;;Winter;;Spring;;Summer