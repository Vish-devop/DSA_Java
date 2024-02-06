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
class SwappingNodeInALinkedList {
    // https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
    public ListNode swapNodes(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;
        ListNode first = null;
        while(temp != null) {
            n++;
            if(n == k) {
                first = temp;
            }
            temp = temp.next;
        }
        temp = head;
        n = n - k;
        while(n > 0) {
            temp = temp.next;
            n--;
        }
        int num = first.val;
        first.val = temp.val;
        temp.val = num;

        return head;

    }
}