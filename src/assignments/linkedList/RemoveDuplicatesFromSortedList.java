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
class RemoveDuplicatesFromSortedList {
    // https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode prev = head;
        ListNode curr = head.next;
        
        while (curr != null) {
            if (prev.val != curr.val) {
                temp.next = prev;
                temp = temp.next;
            } else {
                while (curr != null && prev.val == curr.val) {
                    curr = curr.next;
                }
            }
            prev = curr;
            if (curr != null) {
                curr = curr.next;
            }
        }
        temp.next = prev;
        return dummy.next;
    }
}