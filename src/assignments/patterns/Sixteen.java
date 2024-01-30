package src.assignments.patterns;

import java.util.Scanner;

public class Sixteen {
    //    16.         1
    //              1   1
    //            1   2   1
    //          1   3   3   1
    //         1   4   6   4   1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }int temp = 0;
            for (int j = 1; j <= i; j++) {

                if(i == 1 || j == 1) {
                    temp = 1;
                }
                else {
                    temp = temp * (i - j + 1) / (j - 1);
                }
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}
