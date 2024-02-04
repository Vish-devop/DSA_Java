package src.assignments.linkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionOfTwoLinkedList {
    // https://leetcode.com/problems/intersection-of-two-linked-lists/
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();

        ListNode temp = headA;
        while(temp != null) {
            set.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while(temp != null) {
            if(set.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}