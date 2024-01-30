package src.assignments.binarySearch;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNandDoubleNExist {
    // https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
    class Solution {
        public boolean checkIfExist(int[] arr) {
            Set<Integer> set = new HashSet<>();
            for (int x : arr) {
                if (set.contains(2 * x) || (x % 2 == 0 && set.contains(x / 2))) {
                    return true;
                }
                set.add(x);
            }
            // Arrays.sort(arr);
            // for (int x : arr) {
            //     if (x == 0) {
            //         if (countZeros(arr) > 1) {
            //             return true;
            //         }
            //     } else if (binarySearch(arr, 2 * x)) {
            //         return true;
            //     }
            // }
            return false;
        }

        private boolean binarySearch(int[] arr, int target) {
            int i = 0;
            int j = arr.length - 1;
            while (i <= j) {
                int mid = i + (j - i) / 2;
                if (arr[mid] == target) {
                    return true;
                } else if (arr[mid] > target) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }
            return false;
        }

        private int countZeros(int[] arr) {
            int count = 0;
            for (int num : arr) {
                if (num == 0) {
                    count++;
                }
            }
            return count;
        }
    }

}
