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
class AddTwoNumbersII {
    // https://leetcode.com/problems/add-two-numbers-ii/
    private ListNode addTwoNumbersReverseLL(ListNode a, ListNode b) {
        if(a == null && b == null) {
            return null;
        }
        if(a == null) {
            return b;
        }
        if(b == null) {
            return a;
        }
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        int carry = 0;
        while(a != null && b != null) {
            int sum = a.val + b.val + carry;
            
            ListNode temp = new ListNode(sum % 10);
            if(sum > 9) {
                carry = sum / 10;
            }
            else {
                carry = 0;
            }
            prev.next = temp;
            prev = temp;
            a = a.next;
            b = b.next;
        }
        while(a != null) {
            int sum = a.val + carry;
            ListNode temp = new ListNode(sum % 10);
            if(sum > 9) {
                carry = sum / 10;
            }
            else {
                carry = 0;
            }
            prev.next = temp;
            prev = temp;
            a = a.next;
        }
        while(b != null) {
            int sum = b.val + carry;
            
            ListNode temp = new ListNode(sum % 10);
            if(sum > 9) {
                carry = sum / 10;
            }
            else {
                carry = 0;
            }
            prev.next = temp;
            prev = temp;
            b = b.next;
        }
        if(carry != 0) {
            ListNode temp = new ListNode(carry);
            prev.next = temp;
            prev = temp;
        }
        return dummy.next;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseLinkedList(l1);
        l2 = reverseLinkedList(l2);

        ListNode ans = addTwoNumbersReverseLL(l1, l2);
        ans = reverseLinkedList(ans);
        
        return ans;
    }
    private ListNode reverseLinkedList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    } 
}