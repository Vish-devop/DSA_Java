package src.assignments.sorting;

import java.util.Arrays;

class MajorityElement {

    // https://leetcode.com/problems/majority-element/
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}