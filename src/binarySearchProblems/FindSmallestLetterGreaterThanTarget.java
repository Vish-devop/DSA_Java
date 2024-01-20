package src.binarySearchProblems;

public class FindSmallestLetterGreaterThanTarget {

    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            int i = 0;
            int j = letters.length - 1;
            while(i <= j) {
                int mid = i + (j - i) / 2;

                if(letters[mid] <= target) {
                    i = mid + 1;
                }
                else {
                    j = mid - 1;
                }
            }
            return letters[i % letters.length];
        }
    }
}
