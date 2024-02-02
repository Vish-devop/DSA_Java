package src.assignments.sorting;

import java.util.Arrays;

class ThirdMaximumNumber {
    // https://leetcode.com/problems/third-maximum-number/
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int ans = nums[nums.length - 1];
        int k = 1;
        
        for(int i = nums.length-2; i >= 0; i--) {
            if(nums[i + 1] == nums[i]) {
                continue;
            }
            else {
                k++;                
                if(k == 3) {
                    ans = nums[i];
                    break;
                }
            }
        }
        return nums.length >= 3 ? ans : nums[nums.length-1];
    }
}