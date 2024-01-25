package src.binarySearchProblems;

public class FindPeakElement_ii {
    // https://leetcode.com/problems/find-a-peak-element-ii/
    class Solution {
        public int[] findPeakGrid(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;

            int i = 0;
            int j = n - 1;
            while (i <= j) {
                int mid = i + (j - i) / 2;

                int row = maxElement(mat, m, n, mid);

                int left = mid - 1 >= 0 ? mat[row][mid - 1] : -1;
                int right = mid + 1 < n ? mat[row][mid + 1] : -1;

                if (mat[row][mid] > left && mat[row][mid] > right) {
                    return new int[]{row, mid};
                } else if (mat[row][mid] < left) j = mid - 1;
                else i = mid + 1;
            }
            return new int[]{-1, -1};
        }

        private int maxElement(int[][] mat, int m, int n, int mid) {
            int result = Integer.MIN_VALUE;
            int prev = result;
            int ans = 0;
            for (int i = 0; i < m; i++) {
                prev = result;
                result = Math.max(result, mat[i][mid]);
                if (prev != result) {
                    ans = i;
                }
            }
            return ans;
        }
    }
}
