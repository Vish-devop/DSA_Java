package src.assignments.conditionalsLoops;

import java.util.Scanner;

public class AreaOfCircle {
    private static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        System.out.println("Area of Circle of Radius " + radius + " is " + Math.pow(radius, 2) * PI);
    }
}
