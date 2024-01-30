package src.assignments.binarySearch;

public class SqrtOfX {
    // https://leetcode.com/problems/sqrtx/description/
    class Solution {
        public int mySqrt(int x) {
            if(x <= 1) {
                return x;
            }
            int i = 1;
            int j = x;
            while(i <= j) {
                int mid = i + ( j - i ) / 2;
                long temp = (long) mid * mid;
                if(mid == x) {
                    return mid;
                }
                else if (temp > x) {
                    j = mid - 1;
                }
                else {
                    i = mid + 1;
                }
            }
            return j;
        }
    }
}
