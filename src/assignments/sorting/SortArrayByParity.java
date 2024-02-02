package src.assignments.sorting;

import java.util.ArrayList;
import java.util.List;

class SortArrayByParity {
    // https://leetcode.com/problems/sort-array-by-parity/
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int x: nums) {
            if(x % 2 == 0) {
                even.add(x);
            }
            else {
                odd.add(x);
            }
        }
        int i = 0;
        while(i < even.size()) {
            nums[i] = even.get(i);
            i++;
        }
        int j = i;
        i = 0;
        while(i < odd.size()) {
            nums[j] = odd.get(i);
            i++;
            j++;
        }
        return nums;
    }
}