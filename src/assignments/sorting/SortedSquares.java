package src.assignments.sorting;

import java.util.Arrays;

class SortedSquares {
    // https://leetcode.com/problems/squares-of-a-sorted-array/
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}