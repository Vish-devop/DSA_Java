package src.assignments.binarySearch;

public class ArrangeCoins {
    // https://leetcode.com/problems/arranging-coins/description/

    class Solution {
        public int arrangeCoins(int n) {
            // if(n<0){
            //     return -1;
            // }
            // return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5);
            long i = 0;
            long j = n;
            while(i <= j) {
                long mid = i + ( j - i ) / 2;
                long temp = mid * (mid + 1) / 2;

                if(temp == n) {
                    return (int) mid;
                }
                else if(n > temp) {
                    i = mid + 1;
                }
                else {
                    j = mid - 1;
                }
            }
            return (int) j;
        }
    }
}
