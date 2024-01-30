package src.assignments.binarySearch;

public class TwoSumiiInputedArrayisSorted {
    // https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int[] ans = new int[2];
            for(int i = 0; i < numbers.length; i++) {
                int temp = target - numbers[i];
                int j = i + 1;
                int k = numbers.length - 1;
                boolean isFound = false;
                while(j <= k) {
                    int mid = j + (k - j) / 2;

                    if(numbers[mid] == temp) {
                        ans[0] = i+1;
                        ans[1] = mid+1;
                        isFound=true;
                        break;
                    }
                    else if(numbers[mid] > temp) {
                        k = mid - 1;
                    }
                    else {
                        j = mid + 1;
                    }
                }
                if(isFound == true) {
                    break;
                }
            }
            return ans;
        }
    }
}
