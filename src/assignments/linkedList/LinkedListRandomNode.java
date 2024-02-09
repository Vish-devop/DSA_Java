package src.assignments.linkedList;

import java.util.Random;

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
class LinkedListRandomNode {
    // https://leetcode.com/problems/linked-list-random-node/
    private ListNode head;
    private Random random;

    public LinkedListRandomNode(ListNode head) {
        this.head = head;
        this.random = new Random();

        // ListNode curr = head;
        // while (curr != null) {
        //     length++;
        //     curr = curr.next;
        // }
    }

    public int getRandom() {
        int res = head.val;
        ListNode curr = head;
        int idx = 1;
        while(curr != null) {
            if(random.nextInt(idx) == 0) {
                res = curr.val;
            }
            curr = curr.next;
            idx++;
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */