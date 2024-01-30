package src.assignments.flowOfProgram;

import java.util.Scanner;

public class LCMandHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp1 = a;
        int temp2 = b;

        while (temp2 != 0) {
            int temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }

        int hcf = temp1;
        int lcm = (a * b) / hcf;

        System.out.println("HCF of input numbers: " + hcf);
        System.out.println("LCM of input numbers: " + lcm);
    }
}
