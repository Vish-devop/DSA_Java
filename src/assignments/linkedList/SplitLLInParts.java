package src.assignments.linkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class SplitLLInParts {
    //    https://leetcode.com/problems/split-linked-list-in-parts/
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        ListNode[] ans = new ListNode[k];
        int rem = n % k;
        int size = n / k;
        temp = head;

        for (int i = 0; i < k; i++) {
            int tempSize = size;
            if (rem > 0) {
                tempSize = tempSize + 1;
                rem--;
            }
            ans[i] = temp;
            while (tempSize > 1 && temp != null) {
                temp = temp.next;
                tempSize--;
            }
            if (temp != null) {
                ListNode prev = temp;
                temp = temp.next;
                prev.next = null;
            }
        }
        return ans;
    }
}