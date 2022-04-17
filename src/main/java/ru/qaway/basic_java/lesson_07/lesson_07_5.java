package main.java.ru.qaway.basic_java.lesson_07;

public class lesson_07_5 {

    public static void main(String[] args) {
        String str1 = "This is first string";
        String str2 = "This is second string";
        String str3 = "This is first string";

        System.out.println(str1 + str2);
        System.out.println("str1 length : " + str1.length());
        System.out.println("str2 length : " + str2.length());

        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        System.out.println("str1.equals(str3) : " + str1.equals(str3));
    }
}
