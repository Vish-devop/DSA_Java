package src.assignments.linkedList;

import java.util.HashMap;
import java.util.Map;

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
class RemoveZeroSumConsecutiveNodeFromLL {
    // https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/
    public ListNode removeZeroSumSublists(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode temp = head;
        dummy.next = temp;
        int sum = 0;
        map.put(0, dummy);
        while(temp != null) {
            sum += temp.val;
            if(map.containsKey(sum)) {
                ListNode start = map.get(sum);
                ListNode itr = start;
                int pSum = sum;
                while(itr != temp) {
                    itr = itr.next;
                    pSum += itr.val;
                    if(itr != temp) {
                        map.remove(pSum);
                    }
                }
                start.next = temp.next;
            }
            else {
                map.put(sum, temp);
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}