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
class MergeTwoSortedLinkedList {
    // https://leetcode.com/problems/merge-two-sorted-lists/
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p = list1;
        ListNode q = list2;

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(p != null && q != null) {
            if(p.val > q.val) {
                curr.next = q;
                curr = q;
                q = q.next;
            }
            else {
                curr.next = p;
                curr = p;
                p = curr.next;
            }
        }
        if(p != null) {
            curr.next = p;
        }
        if(q != null) {
            curr.next = q;
        }
        return dummy.next;
    }
}