package src.assignments.firstJava;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rupees = sc.nextInt();

        System.out.println("The converted INR into dollar is : " + rupees * 82.96);
    }
}
