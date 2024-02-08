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
class PartitionList {
    // https://leetcode.com/problems/partition-list/
    public ListNode partition(ListNode head, int x) {
        if(head == null) {
            return head;
        }
        ListNode left = new ListNode(-201);
        ListNode right = new ListNode(-201);
        ListNode temp = head;
        ListNode prevLeft = left;
        ListNode prevRight = right;

        while(temp != null) {
            if(temp.val < x) {
                prevLeft.next = temp;
                prevLeft = temp;
            }
            else {
                prevRight.next = temp;
                prevRight = temp;
            }
            temp = temp.next;
        }
        if(prevRight.next != null) {
            prevRight.next = null;
        }
        prevLeft.next = right.next;
        return left.next;
    }
}