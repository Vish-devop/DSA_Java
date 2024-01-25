package src.stringProblems;

public class LargestOddNumber {
    // https://leetcode.com/problems/largest-odd-number-in-string/
    class Solution {
        public String largestOddNumber(String num) {
            int n = num.length();
            if(num.charAt(n-1) != '0' && Integer.valueOf(num.charAt(n-1)) % 2 != 0) {
                return num;
            }

            char[] arr = num.toCharArray();

            for(int i = n - 1; i >= 0; i--) {
                if(Integer.valueOf(arr[i]) != 0 && Integer.valueOf(arr[i]) % 2 != 0) {
                    return num.substring(0, i+1);
                }
            }
            return "";
        }
    }
}
