package src.assignments.linkedList;

class MyLinkedList {
    // https://leetcode.com/problems/design-linked-list/
    private ListNode head;
    private int size;

    public MyLinkedList() {
        this.head = new ListNode(-1);
    }
    
    public int get(int index) {
        if(index < 0 || index >= size) {
            return -1;
        }
        ListNode temp = this.head;
        for(int i = 0; i < index + 1; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(this.size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > this.size) {
            return;
        }
        if(index < 0) {
            index = 0;
        }
        ++size;
        ListNode temp = this.head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        ListNode node = new ListNode(val);
        node.next = temp.next;
        temp.next = node;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= this.size) {
            return;
        }        
        size--;
        ListNode temp = this.head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */