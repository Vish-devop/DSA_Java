package src.stringProblems;

import java.util.Stack;

public class ReverseWordsInAString {

    //  https://leetcode.com/problems/reverse-words-in-a-string/
    class Solution {
        public String reverseWords(String s) {
            Stack<String> stack = new Stack<>();
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != ' ') {
                    StringBuilder temp = new StringBuilder();
                    while(i < s.length() && s.charAt(i) != ' ') {
                        temp.append(s.charAt(i));
                        i++;
                    }
                    stack.push(temp.toString());
                }
            }
            StringBuilder ans = new StringBuilder();
            while(!stack.isEmpty()) {
                ans.append(stack.pop());
                if(stack.size() != 0) {
                    ans.append(" ");
                }
            }
            return ans.toString();
        }

    }
}
