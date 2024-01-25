package src.binarySearchProblems;

public class CapacityToShipPackagesWithinDDays {
    // https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
    class Solution {
        public int shipWithinDays(int[] weights, int days) {
            int low = 0;
            int high = 0;

            for (int i = 0; i < weights.length; i++) {
                low = Math.max(low, weights[i]);
                high += weights[i];
            }

            while (low < high) {
                int mid = low + (high - low) / 2;
                int sum = 0;
                int count = 1;
                for (int x : weights) {
                    if (sum + x > mid) {
                        sum = x;
                        count++;
                    } else {
                        sum += x;
                    }
                }
                if (count > days) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return high;

        }
    }
}
