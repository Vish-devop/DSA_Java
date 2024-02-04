package src.assignments.sorting;

public class SortArrayByParityII {
    // https://leetcode.com/problems/sort-array-by-parity-ii/
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;
        int[] ans = new int[nums.length];
        for(int x : nums) {
            if(x % 2 == 0) {
                ans[i] = x;
                i += 2;
            }
            else {
                ans[j] = x;
                j += 2;
            }
        }
        return ans;
    }
}