package src.assignments.binarySearch;

public class CountNegativeNumberFromMatrix {
    // https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/

    class Solution {
        public int countNegatives(int[][] grid) {
            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                int left = 0;
                int right = grid[i].length;

                while (left < right) {
                    int mid = left + (right - left) / 2;
                    if (grid[i][mid] < 0) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }
                count += grid[i].length - left;
            }
            return count;
        }
    }
}
