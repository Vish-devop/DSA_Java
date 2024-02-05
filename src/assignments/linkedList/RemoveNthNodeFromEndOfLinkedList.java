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
class RemoveNthNodeFromEndOfLinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // https://leetcode.com/problems/remove-nth-node-from-end-of-list/
        if(head == null) {
            return head;
        }
        int size = 0;
        ListNode temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        n = n % size;
        if(n == 0) {
            return head.next;
        }
        n = size - n;
        temp = head;
        ListNode prev = head;
        while(temp != null && n > 0) {
            prev = temp;
            temp = temp.next;
            n--;
        }
        prev.next = temp.next;
        return head;
    }
}