package src.binarySearchProblems;

import java.util.ArrayList;
import java.util.List;

public class FindInMountainArray {
    // https://leetcode.com/problems/find-in-mountain-array/description/

    /**
     * // This is MountainArray's API interface.
     * // You should not implement it, or speculate about its implementation
     */
    interface MountainArray {
        public int get(int index);

        public int length();
    }

    static class MountainArrayImpl implements MountainArray {
        List<Integer> arr;

        public MountainArrayImpl() {
            arr = new ArrayList<>();
        }

        @Override
        public int get(int index) {
            return arr.get(index);
        }

        @Override
        public int length() {
            return arr.size();
        }
    }

    class Solution {
        public int findInMountainArray(int target, MountainArray mountainArr) {
            int peakIndex = findPeakElement(mountainArr);
            int minIndex = binarySearch(mountainArr, target, 0, peakIndex, false);
            if (minIndex == -1) {
                System.out.println(peakIndex + " " + (mountainArr.length() - 1));

                return binarySearch(mountainArr, target, peakIndex, mountainArr.length() - 1, true);
            }
            return minIndex;
        }

        private int findPeakElement(MountainArray arr) {
            int i = 0;
            int j = arr.length() - 1;

            while (i != j) {
                int mid = i + (j - i) / 2;
                if (arr.get(mid) > arr.get(mid + 1)) {
                    j = mid;
                } else {
                    i = mid + 1;
                }
            }
            return i;
        }

        private int binarySearch(MountainArray arr, int target, int i, int j, boolean flag) {
            while (i <= j) {
                int mid = i + (j - i) / 2;

                if (arr.get(mid) == target) {
                    return mid;
                }
                if (flag) {
                    if (arr.get(mid) > target) {
                        i = mid + 1;
                    } else {
                        j = mid - 1;
                    }
                } else if (arr.get(mid) < target) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
            return -1;
        }
    }
}
