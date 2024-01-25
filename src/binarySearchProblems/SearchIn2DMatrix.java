package src.binarySearchProblems;

public class SearchIn2DMatrix {
    // https://leetcode.com/problems/search-a-2d-matrix/
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][0] <= target && matrix[i][matrix[i].length - 1] >= target) {
                    return binarySearch(matrix[i], target) != -1;
                }
            }
            return false;
        }

        private int binarySearch(int[] arr, int target) {
            int i = 0;
            int j = arr.length - 1;

            while (i <= j) {
                int mid = i + (j - i) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
            return -1;
        }
    }
}
