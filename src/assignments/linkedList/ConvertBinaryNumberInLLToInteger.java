package src.assignments.linkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ConvertBinaryNumberInLLToInteger {

    // https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
    public int getDecimalValue(ListNode head) {
        StringBuffer binaryNumber = new StringBuffer();
        ListNode temp = head;
        while(temp != null) {
            binaryNumber.append(temp.val);
            temp = temp.next;
        }
        return getNumberFromBinaryNumber(binaryNumber);
    }
    private int getNumberFromBinaryNumber(StringBuffer num) {
        int ans = 0;
        int j = num.length() - 1;
        for(int i = 0; j >= 0; i++) {
            char lastDigit = num.charAt(j);
            if(lastDigit == '1') {
                ans += (int) Math.pow(2, i);
            }
            j--;
        }
        return ans;
    }
}