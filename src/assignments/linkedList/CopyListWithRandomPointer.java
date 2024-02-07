package src.assignments.linkedList;

import java.util.HashMap;
import java.util.Map;

// Definition for a NewNode.
class NewNode {
    int val;
    NewNode next;
    NewNode random;

    public NewNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class CopyListWithRandomPointer {
    // https://leetcode.com/problems/copy-list-with-random-pointer/
    Map<NewNode, NewNode> map = new HashMap();

    public NewNode copyRandomList(NewNode head) {
        if (head == null)
            return null;
        if (map.containsKey(head))
            return map.get(head);
        NewNode newNode = new NewNode(head.val);
        map.put(head, newNode);
        newNode.next = copyRandomList(head.next);
        newNode.random = copyRandomList(head.random);
        return newNode;
    }
}