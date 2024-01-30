package src.assignments.conditionalsLoops;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of width : ");
        int width = sc.nextInt();
        System.out.println("Enter the length : ");
        int length = sc.nextInt();
        System.out.println("Area of rectangle : " + (width * length));
    }
}
