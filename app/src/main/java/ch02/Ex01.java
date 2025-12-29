package ch02;
import java.util.Scanner;

public class Ex01 {

    private static Scanner sc = new Scanner(System.in);

    public static String input() {
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        return name;
    }
    public static String concat(String name) {
        return "Hello, " + name + ", nice to meet you!";
    }
    public static void output() {
        System.out.println(concat(input()));
    }
    public static void main(String[] args) {
        Ex01 ex01 = new Ex01();
        ex01.output();
    }
}
