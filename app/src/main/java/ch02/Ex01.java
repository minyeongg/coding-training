package ch02;
import java.util.Scanner;

public class Ex01 {

    private final Scanner sc = new Scanner(System.in);

    public String input() {
        System.out.print("What is your name? ");
        return sc.nextLine();
    }
    public String concat(String name) {
        return "Hello, " + name + ", nice to meet you!";
    }
    public void output() {
        System.out.println(concat(input()));
    }

    public void close() {
        sc.close();
    }

    public static void main(String[] args) {
        Ex01 ex01 = new Ex01();
        ex01.output();
        ex01.close();
    }
}
