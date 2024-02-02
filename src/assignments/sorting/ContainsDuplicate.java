package src.assignments.sorting;

import java.util.Arrays;

class ContainsDuplicate {
    //    https://leetcode.com/problems/contains-duplicate/
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }
}