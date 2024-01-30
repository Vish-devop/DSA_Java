package src.assignments.flowOfProgram;

import java.util.Scanner;
public class PrintSumUntilEnterX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        // get sum until users enters -1 as input
        while(n != -1) {
            sum += n;
            n = sc.nextInt();
        }
        System.out.println(sum);
    }
}