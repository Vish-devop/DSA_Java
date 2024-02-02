package src.assignments.sorting;

import java.util.Arrays;
class ArrayPartition {
    // https://leetcode.com/problems/array-partition/
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0; i < n; i += 2) {
            ans += nums[i];
        }
        return ans;
    }
}