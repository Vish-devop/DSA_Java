package src.assignments.linkedList;

import java.util.ArrayList;
import java.util.List;

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
class FindMinMaxNumOfNodesBwCriticalPoints {
    // https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        if (head == null) {
            return ans;
        }
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        ListNode prev = temp;
        int i = 1;
        while (temp.next != null) {
            if ((temp.val < prev.val && temp.val < temp.next.val) ||
                    (temp.val > prev.val && temp.val > temp.next.val)) {
                list.add(i);
            }
            ++i;
            prev = temp;
            temp = temp.next;
        }
        if (list.size() <= 1) {
            return ans;
        }
        int min = Integer.MAX_VALUE;
        for (i = 1; i < list.size(); i++) {
            min = Math.min(min, (int) Math.abs(list.get(i) - list.get(i - 1)));
        }
        ans[0] = min;
        ans[1] = list.get(list.size() - 1) - list.get(0);
        return ans;
    }
}