package src.assignments.binarySearch;

public class ReachANumber {
    // https://leetcode.com/problems/reach-a-number/
    class Solution {
        public int reachNumber(int target) {
            int pos = 0;
            int steps = 0;
            target = Math.abs(target);
            int i = 1;
            int j = target;
            while (i <= j) {
                int mid = i + (j - i) / 2;
                long sum = (long) mid * (mid + 1) / 2;
                if (sum >= target) {
                    pos = (int) sum;
                    steps = mid;
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }
            while ((pos - target) % 2 == 1) {
                steps++;
                pos += steps;
            }
            return steps;
        }
    }
}
