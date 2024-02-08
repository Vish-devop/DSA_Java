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
class SwapNodesInPair {
    // https://leetcode.com/problems/swap-nodes-in-pairs/
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode ans = new ListNode(-1);
        ans.next = head;
        ListNode temp = ans;

        while(temp.next != null && temp.next.next != null) {
            ListNode curr = temp.next;
            ListNode nextCurr = temp.next.next;

            temp.next = nextCurr;
            curr.next = nextCurr.next;
            nextCurr.next = curr;
            temp = temp.next.next;
        }
        return ans.next;
    }

    // private ListNode swapNodes(ListNode a, ListNode b) {
    //     // ListNode temp = new ListNode(a.val, a.next);
    //     // a.val = b.val;
    //     // b.val = temp.val;
    //     ListNode first = current.next; // a
    //     ListNode second = current.next.next; // b
    //     current.next = second;
    //     a.next = second.next;
    //     second.next = a;
    //     current = current.next.next;
    //     return a;
    // } 
}