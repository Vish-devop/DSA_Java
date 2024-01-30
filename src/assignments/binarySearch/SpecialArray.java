package src.assignments.binarySearch;

public class SpecialArray {
    // https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
    class Solution {
        public int specialArray(int[] nums) {
            int n = nums.length;
            int[] counts = new int[n+1];

            for(int x : nums)
                if(x >= n)
                    counts[n]++;
                else
                    counts[x]++;

            int res = 0;
            for(int i = counts.length-1; i > 0; i--) {
                res += counts[i];
                if(res == i)
                    return i;
            }
            return -1;

        }
    }
}
