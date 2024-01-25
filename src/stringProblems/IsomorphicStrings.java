package src.stringProblems;

import java.util.Arrays;

public class IsomorphicStrings {

    // https://leetcode.com/problems/isomorphic-strings/description/
    public boolean isIsomorphic(String s, String t) {
        char[] sToT = new char[256];
        char[] tToS = new char[256];

        Arrays.fill(sToT, '0');
        Arrays.fill(tToS, '0');

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sToT[sChar] == '0' && tToS[tChar] == '0') {
                sToT[sChar] = tChar;
                tToS[tChar] = sChar;
            } else {
                if (sToT[sChar] != tChar || tToS[tChar] != sChar) {
                    return false;
                }
            }
        }
        return true;
    }
}
