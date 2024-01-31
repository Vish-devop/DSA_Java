package src.assignments.binarySearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindRightInterval {
    // https://leetcode.com/problems/find-right-interval/
    class Solution {
        public int[] findRightInterval(int[][] intervals) {
            int n = intervals.length;
            int[] arr = new int[n];
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = intervals[i][0];
            }

            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(arr[i], i);
            }
            Arrays.sort(arr);
            for (int x : arr) {
                System.out.println(x);
            }
            for (int i = 0; i < n; i++) {
                int temp = binarySearch(arr, intervals[i][1]);
                if (temp != -1) {
                    ans[i] = map.get(arr[temp]);
                } else {
                    ans[i] = -1;
                }
            }
            return ans;
        }

        private int binarySearch(int[] arr, int target) {
            int i = 0;
            int j = arr.length - 1;
            int ans = -1;
            while (i <= j) {
                int mid = i + (j - i) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    ans = mid;
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }
            return ans;
        }
    }
}
