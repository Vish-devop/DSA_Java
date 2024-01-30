package src.assignments.firstJava;

import java.util.Scanner;

public class LargestOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b) {
            System.out.println(a + " is Greater than " + b);
        }
        else if(a < b) {
            System.out.println(a + " is Less than " + b);
        }
        else {
            System.out.println(a + " is Equal to " + b);
        }
    }
}
