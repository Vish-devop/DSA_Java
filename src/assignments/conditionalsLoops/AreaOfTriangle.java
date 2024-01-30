package src.assignments.conditionalsLoops;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base length of the Triangle : ");
        int base = sc.nextInt();
        System.out.println("Enter the height length of the Triangle : ");
        int height = sc.nextInt();

        System.out.println("Area of triangle : " + 0.5 * base * height);
    }
}
