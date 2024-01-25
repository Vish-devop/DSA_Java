package src.stringProblems;

public class ValidAnagram {

    // https://leetcode.com/problems/valid-anagram/
    class Solution {
        public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()) return false;
            int[] arr = new int[26];
            for(char x: s.toCharArray()) {
                arr[x - 'a'] += 1;
            }

            for(char x: t.toCharArray()) {
                arr[x - 'a'] -= 1;
                if(arr[x - 'a'] < 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
