package src.assignments.linkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
class NextGreaterNodeInALL {
    // https://leetcode.com/problems/next-greater-node-in-linked-list/
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            while (!stack.isEmpty() && list.get(stack.peek()) < list.get(i)) {
                ans[stack.pop()] = list.get(i);
            }
            stack.push(i);
        }
        return ans;
    }
}