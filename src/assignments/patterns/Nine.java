package src.assignments.patterns;

import java.util.Scanner;

public class Nine {
    //    9.     *********
    //            *******
    //             *****
    //              ***
    //               *
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numberOfStars = 2 * n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= numberOfStars; j++) {
                System.out.print("*");
            }
            numberOfStars -= 2;
            System.out.println();
        }
    }
}
