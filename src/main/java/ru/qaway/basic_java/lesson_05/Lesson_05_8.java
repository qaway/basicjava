package main.java.ru.qaway.basic_java.lesson_05;

public class Lesson_05_8 {

    public static void main(String[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday", "Sunday"};

        for (String weekday : week) {
            if (weekday.startsWith("W"))
                continue;

            System.out.println(weekday);
        }
    }
}
