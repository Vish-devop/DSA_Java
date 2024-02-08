package src.assignments.linkedList;

import java.util.HashMap;
import java.util.Map;

class DoublyLLNode {
    int key;
    int val;
    DoublyLLNode next;
    DoublyLLNode prev;

    public DoublyLLNode(int key, int val) {
        this.key = key;
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
class LRUCache {
    // https://leetcode.com/problems/lru-cache/
    private Map<Integer, DoublyLLNode> map = new HashMap<>();
    private DoublyLLNode head = null;
    private DoublyLLNode tail = null;
    private int capacity = 0;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new DoublyLLNode(0, 0);
        this.tail = new DoublyLLNode(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        DoublyLLNode node = map.get(key);
        if(node == null) {
            return -1;
        }
        remove(node);
        insert(node);
        return node.val;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) {
            remove(map.get(key));
        }
        if(map.size() == capacity) {
            remove(tail.prev);
        }
        insert(new DoublyLLNode(key, value));
    }
    private void insert(DoublyLLNode node) {
        map.put(node.key, node);
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;    
    }

    private void remove(DoublyLLNode node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */