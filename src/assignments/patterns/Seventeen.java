package src.assignments.patterns;

import java.util.Scanner;

public class Seventeen {
    //    17.       1
    //             212
    //            32123
    //           4321234
    //          543212345
    //           4321234
    //            32123
    //             212
    //              1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int  i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for(int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(' ');
            }
            for(int j = n - i; j >= 1; j--){
                System.out.print(j);
            }
            for (int j = 2; j <= n-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
