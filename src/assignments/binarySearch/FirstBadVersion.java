package src.assignments.binarySearch;

public class FirstBadVersion {
    // https://leetcode.com/problems/first-bad-version/
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    class VersionControl {
        public boolean isBadVersion(int num) {
            if(num > 0) {
                return false;
            }
            return true;
        }
    }
    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int i = 1;
            int j = n;
            int mid = 0;
            while(i < j) {
                mid = i + ( j - i ) / 2;
                if(isBadVersion(mid)) {
                    j = mid;
                }
                else {
                    i = mid + 1;
                }
            }

            return j;
        }
    }
}
