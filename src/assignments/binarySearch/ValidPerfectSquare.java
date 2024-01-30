package src.assignments.binarySearch;

public class ValidPerfectSquare {
    // https://leetcode.com/problems/valid-perfect-square/description/

    class Solution {
        public boolean isPerfectSquare(int num) {
            if(num <= 1) {
                return true;
            }
            int i = 1;
            int j = num;
            while( i <= j ) {
                int mid = i + ( j - i ) / 2;
                long temp = (long) mid * mid;
                if(temp == num) {
                    return true;
                }
                else if(temp > num) {
                    j = mid - 1;
                }
                else {
                    i = mid + 1;
                }
            }
            return false;
        }
    }
}
