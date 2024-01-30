package src.assignments.firstJava;

import java.util.Scanner;

public class PalindromicStringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        boolean isPalindrome = true;
        while(i < j) {
            if(arr[i] != arr[j]) {
                System.out.println(str + " is not a Palindromic String.");
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrome) {
            System.out.println(str + " is Palindromic String.");
        }
    }
}
