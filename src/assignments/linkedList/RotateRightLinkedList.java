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
class RotateRightLinkedList {
    // https://leetcode.com/problems/rotate-list/
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0 || head.next == null) {
            return head;
        }
        int size = 0;
        ListNode temp = head; 
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        int n = k % size;
        n = size - n;
        if(n == size) {
            return head;
        }
        temp = head;

        ListNode prev = head;
        while(temp != null && n > 0) {
            prev = temp;
            temp = temp.next;
            n--;
        }
        prev.next = null;
        ListNode newHead = temp;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        return newHead;
    }
}