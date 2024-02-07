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
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode p = l1;
        ListNode q = l2;
        while(p != null && q != null) {
            int sum = p.val + q.val + carry;
            carry = sum / 10;
            ListNode s = new ListNode(sum % 10);
            temp.next = s;
            temp = temp.next;
            p = p.next;
            q = q.next;
        }
        while(p != null) {
            int sum = p.val + carry;
            carry = sum / 10;
            ListNode s = new ListNode(sum % 10);
            temp.next = s;
            temp = temp.next;
            p = p.next;
        }
        while(q != null) {
            int sum = q.val + carry;
            carry = sum / 10;
            ListNode s = new ListNode(sum % 10);
            temp.next = s;
            temp = temp.next;
            q = q.next;
        }
        if(carry != 0) {
            ListNode carryNode = new ListNode(carry);
            temp.next = carryNode;
        }
        return dummy.next;
    }
}