package src.assignments.patterns;

import java.util.Scanner;

public class Eighteen {
    //      18.   **********
    //            ****  ****
    //            ***    ***
    //            **      **
    //            *        *
    //            *        *
    //            **      **
    //            ***    ***
    //            ****  ****
    //            **********
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= 2*n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print('*');
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
