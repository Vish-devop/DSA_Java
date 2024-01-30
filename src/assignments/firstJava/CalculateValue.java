package src.assignments.firstJava;

import java.util.Scanner;

public class CalculateValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(1);

        if(operator == '+') {
            System.out.println(a + b);
        }
        if(operator == '-') {
            System.out.println(a - b);
        }
        if(operator == '*') {
            System.out.println(a * b);
        }
        if(operator == '/') {
            System.out.println(a / b);
        }
        if(operator == '%') {
            System.out.println(a % b);
        }
    }
}
