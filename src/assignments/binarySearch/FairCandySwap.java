package src.assignments.binarySearch;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    // https://leetcode.com/problems/fair-candy-swap/description/

    class Solution {
        public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
            int aliceSum = 0;
            for(int x: aliceSizes) {
                aliceSum += x;
            }
            int bobSum = 0;
            Set<Integer> bobSet = new HashSet<>();
            for(int x: bobSizes) {
                bobSum += x;
                bobSet.add(x);
            }
            int sum = (aliceSum - bobSum) / 2;

            for(int x: aliceSizes) {
                int temp = x - sum;
                if(bobSet.contains(temp)) {
                    return new int[]{x, temp};
                }
            }
            return new int[0];
        }
    }
}
