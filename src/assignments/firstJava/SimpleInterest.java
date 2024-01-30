package src.assignments.firstJava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();

        System.out.println("Simple Interest : " + principal * (1 + (rate * time)));
    }
}
