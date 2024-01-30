package src.assignments.firstJava;

import java.util.Scanner;

public class FibbonacciNumberUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 1; i <= n; i++) {
            System.out.print((a + b) + " ");
            a = a + b;
            b = a - b;
        }
    }
}
