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
class RemoveDuplicates {

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list/
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode dummy = new ListNode(-101);
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr != null) {
            if(curr.val == prev.val) {
                curr = curr.next;
                if(curr == null) {
                    prev.next = null;
                    break;
                }
                continue;
            }
            prev.next = curr;
            prev = curr;
            curr = curr.next;
        }
        return dummy.next;
    }
}