package src.assignments.firstJava;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name + ", Good Morning!! Wish you a good luck");
    }
}
