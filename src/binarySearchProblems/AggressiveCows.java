package src.binarySearchProblems;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {

    // https://www.spoj.com/problems/AGGRCOW/
    /*
        Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls.
        The stalls are located along a straight line at positions x1 ... xN (0 <= xi <= 1,000,000,000).
        His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other
        once put into a stall. To prevent the cows from hurting each other, FJ wants to assign the cows
        to the stalls, such that the minimum distance between any two of them is as large as possible.
        What is the largest minimum distance?
        INPUT
        t – the number of test cases, then t test cases follows.
        * Line 1: Two space-separated integers: N and C
        * Lines 2..N+1: Line i+1 contains an integer stall location, xi
        OUTPUT
        For each test case output one integer: the largest minimum distance.
    * */


    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(solve(arr, n, c));
            t--;
        }
    }

    /*
    * Example
    Input:
        T: 1
        N: 5 C: 3
        arr[N]: 1 2 8 4 9
    Output: 3
    Explanation: FJ can put his 3 cows in the stalls at positions 1, 4 and 8,
                 resulting in a minimum distance of 3.
    * */
    private static int solve(int[] arr, int n, int c) {
        // This function should return the LARGEST MINIMUM DISTANCE
        Arrays.sort(arr);
        int low = 1;
        int high = arr[n - 1] - arr[0];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(arr, mid, c)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    private static boolean check(int[] arr, int d, int c) {
        int countC = 1;
        int prev = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - prev >= d) {
                countC++;
                prev = arr[i];
            }
            if (countC >= c) return true;
        }
        return false;
    }
}
