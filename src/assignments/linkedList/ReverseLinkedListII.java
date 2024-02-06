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
class ReverseLinkedListII {
    // https://leetcode.com/problems/reverse-linked-list-ii/
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = dummy;
        ListNode prev = null;
        for(int i = 0; i < left; i++) {
            prev = curr;
            curr = curr.next;
        }
        ListNode temp = prev;
        ListNode next = curr;
        for(int i = left; i <= right; i++) {
            ListNode node = next.next;
            next.next = temp;
            temp = next;
            next = node;
        }
        prev.next = temp;
        curr.next = next;
        return dummy.next;
    }
}