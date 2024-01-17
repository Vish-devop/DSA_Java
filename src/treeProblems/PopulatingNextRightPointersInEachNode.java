package src.treeProblems;

public class PopulatingNextRightPointersInEachNode {
    // https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/

    // Definition for a Node.
    class Node {
        public int val;

        public Node left;

        public Node right;

        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    ;

    class Solution {

        public Node connect(Node root) {
            if (root == null) {
                return root;
            }

            Node prevLeft = root;
            while (prevLeft.left != null) { // BECAUSE THIS IS THE PERFECT BINARY TREE
                Node curr = prevLeft;
                while (curr != null) {
                    curr.left.next = curr.right;
                    if (curr.next != null) {
                        curr.right.next = curr.next.left;
                    }
                    curr = curr.next;
                }
                prevLeft = prevLeft.left;
            }
            return root;
        }
        // public Node connect(Node root) {
        //     if(root == null) {
        //         return root;
        //     }
        //     List<List<Node>> levelOrder = new ArrayList<>();
        //     getLevelOrder(root, levelOrder);
        //     for(List<Node> y: levelOrder) {
        //         for(int i = 0; i < y.size()-1; i++) {
        //             y.get(i).next = y.get(i+1);
        //         }
        //         y.get(y.size() - 1).next = null;
        //     }
        //     return root;
        // }

        // private void getLevelOrder(Node root, List<List<Node>> arr) {
        //     if(root == null) {
        //         return;
        //     }
        //     Queue<Node> q = new LinkedList<>();
        //     q.offer(root);
        //     while(!q.isEmpty()) {
        //         int levelSize = q.size();
        //         List<Node> temp = new ArrayList<>();
        //         for(int i = 0; i < levelSize; i++) {
        //             Node node = q.poll();
        //             temp.add(node);
        //             if(node.left != null) {
        //                 q.offer(node.left);
        //             }
        //             if(node.right != null) {
        //                 q.offer(node.right);
        //             }
        //         }
        //         arr.add(temp);
        //     }
        // }
    }
}
