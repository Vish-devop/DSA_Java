package src.assignments.firstJava;

import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int numDigits = String.valueOf(num).length();
        int armstrongSum = 0;

        while (num > 0) {
            int digit = num % 10;
            armstrongSum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return armstrongSum == originalNum;
    }

    // Function to find Armstrong numbers between a given range
    public static void findArmstrongNumbers(int start, int end) {
        System.out.printf("Armstrong numbers between %d and %d:%n", start, end);
        for (int number = start; number <= end; number++) {
            if (isArmstrongNumber(number)) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        // Example: Find Armstrong numbers between 100 and 1000
        int startRange = 100;
        int endRange = 1000;

        findArmstrongNumbers(startRange, endRange);
    }
}
