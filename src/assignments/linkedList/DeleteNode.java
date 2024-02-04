package src.assignments.linkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class DeleteNode {
    // https://leetcode.com/problems/delete-node-in-a-linked-list/
    public void deleteNode(ListNode node) {
        ListNode temp = node;   
        ListNode prev = node;
        while(temp.next != null) {
            temp.val = temp.next.val;
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }
}