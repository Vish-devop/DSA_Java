package src.assignments.binarySearch;

public class GuessNumberHigherOrLower {
    // https://leetcode.com/problems/guess-number-higher-or-lower/description/
    /**
     * Forward declaration of guess API.
     * @param  //num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
     */

    class GuessGame {
        public int guess(int num) {
            return Integer.MAX_VALUE;
        }
    }

    public class Solution extends GuessGame {
        public int guessNumber(int n) {
            int i = 1;
            int j = n;
            while(i <= j) {
                int mid = i + (j - i) / 2;
                int temp = guess(mid);
                if(temp == 0) {
                    return mid;
                }
                else if(temp == -1) {
                    j = mid - 1;
                }
                else {
                    i = mid + 1;
                }
            }
            return -1;
        }
    }
}
