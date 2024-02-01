package src.assignments.binarySearch;

public class KokoEatingBananas {
    // https://leetcode.com/problems/koko-eating-bananas/


    class Solution {
        private boolean canEatAllBananas(int[] arr, int val, int h) {
            int sum = 0;
            for (int x : arr) {
                sum += x / val;
                if (x % val < val && x % val != 0) {
                    sum += 1;
                }
                if (sum > h) {
                    return false;
                }
            }
            return true;
        }

        public int minEatingSpeed(int[] piles, int h) {
            int i = 1;
            int j = 0;
            for (int x : piles) {
                j = Math.max(j, x);
            }

            while (i != j) {
                int mid = i + (j - i) / 2;
                if (canEatAllBananas(piles, mid, h)) {
                    j = mid;
                } else {
                    i = mid + 1;
                }
            }
            return j;
        }
    }

}
