package src.assignments.binarySearch;

public class FindKthMissingPositiveNumber {
    // https://leetcode.com/problems/kth-missing-positive-number/description/

    class Solution {
        public int findKthPositive(int[] arr, int k) {
            int n = arr.length;
            int i = 0;
            int j = n-1;
            while(i <= j) {
                int mid = i + (j - i) / 2;
                int temp = arr[mid] -( mid + 1 );
                if(temp >= k) {
                    j = mid - 1;
                }
                else {
                    i = mid + 1;
                }
            }
            return i + k;
        }
    }
}
