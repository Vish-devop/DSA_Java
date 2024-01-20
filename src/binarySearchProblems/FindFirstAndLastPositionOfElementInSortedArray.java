package src.binarySearchProblems;

public class FindFirstAndLastPositionOfElementInSortedArray {
    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int lt = binarySearch(nums, target, true);
            int rt = binarySearch(nums, target, false);

            if (lt <= rt) {
                return new int[]{lt, rt};
            } else {
                return new int[]{-1, -1};
            }
        }

        private int binarySearch(int[] nums, int target, boolean flag) {
            int left = 0;
            int right = nums.length - 1;
            int result = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    result = mid;
                    if(flag){
                        right = mid - 1;
                    }
                    else {
                        left = mid + 1;
                    }
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return result;
        }
    }

}
