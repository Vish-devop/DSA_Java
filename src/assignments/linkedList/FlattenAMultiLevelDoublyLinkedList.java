package src.assignments.linkedList;

import java.util.Stack;

// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};


class FlattenAMultiLevelDoublyLinkedList {
    //    https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/

    public Node flatten(Node head) {
        Node curr = head;
        Node prev = head;

        Stack<Node> stack = new Stack<>();
        while (curr != null) {
            if (curr.child != null) {
                if (curr.next != null) {
                    stack.push(curr.next);
                }
                Node child = curr.child;
                curr.child = null;
                curr.next = child;
                child.prev = curr;
            }
            prev = curr;
            curr = curr.next;
        }
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            prev.next = temp;
            temp.prev = prev;
            curr = prev;
            while (curr != null) {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}