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
class InsertionSortLL {
    // https://leetcode.com/problems/insertion-sort-list/
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-5001);
        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null) {
            if (prev.val <= curr.val) {
                prev.next = curr;
                prev = prev.next;
            } else {
                ListNode start = dummy.next;
                ListNode prevStart = dummy;
                while (start != prev && start.val < curr.val) {
                    prevStart = start;
                    start = start.next;
                }
                prev.next = curr.next;
                curr.next = start;
                prevStart.next = curr;
            }
            curr = prev.next;
        }
        return dummy.next;
    }
}