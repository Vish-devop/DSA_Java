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
class MergeInBetweenLL {
    //    https://leetcode.com/problems/merge-in-between-linked-lists/
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        int n = 0;
        ListNode start = null;
        while (temp != null) {
            if (n == a) {
                start.next = list2;
            }
            if (n == b) {
                ListNode end = list2;
                while (end.next != null) {
                    end = end.next;
                }
                end.next = temp.next;
            }
            n++;
            start = temp;
            temp = temp.next;
        }
        return list1;
    }
}