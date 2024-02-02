package src.assignments.sorting;

import java.util.Arrays;

class MergeSortedArray {
    // https://leetcode.com/problems/merge-sorted-array/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) {
            return;
        }
        int j = 0;
        for(int i = 0; i < m; i++) {
            if(nums1[i] > nums2[j]) {
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                Arrays.sort(nums2);
            }
        }
        j = 0;
        for(int i = m; i < m+n; i++) {
            nums1[i] = nums2[j];
            j++;
        }
    }
}