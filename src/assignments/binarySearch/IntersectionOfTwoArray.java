package src.assignments.binarySearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArray {
    // https://leetcode.com/problems/intersection-of-two-arrays/description/
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Arrays.sort(nums2);

            Set<Integer> result = new HashSet<>();

            for (int num : nums1) {
                if (binarySearch(nums2, num)) {
                    result.add(num);
                }
            }
            int[] intersectionArray = new int[result.size()];
            int i = 0;
            for(Integer x: result) {
                intersectionArray[i] = x;
                i++;
            }

            return intersectionArray;
        }

        private static boolean binarySearch(int[] nums, int target) {
            int left = 0, right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return true;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return false;
        }
    }
}
