package src.assignments.flowOfProgram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println(year + " is the LEAP year");
                }
                else {
                    System.out.println(year + " is NOT the LEAP year");
                }
            }
            else {
                System.out.println(year + " is the LEAP year");
            }
        }
        else {
            System.out.println(year + "is NOT the LEAP year");
        }
    }
}