package src.treeProblems.binarySearchTreeProblems;

import java.util.LinkedList;
import java.util.Queue;

public class BSTIterator {

    //  Definition for a binary tree node.
    public class TreeNode {
        int val;

        TreeNode left;

        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class BSTIteratorLC {
        Queue<TreeNode> queue;

        public BSTIteratorLC(TreeNode root) {
            queue = new LinkedList<>();
            populateIterator(root);
        }

        private void populateIterator(TreeNode root) {
            if (root == null) {
                return;
            }

            populateIterator(root.left);
            queue.add(root);
            populateIterator(root.right);
        }

        public int next() {
            if (queue.isEmpty()) {
                return -1;
            }
            TreeNode temp = queue.poll();
            return temp.val;
        }

        public boolean hasNext() {
            return queue.size() > 0;
        }
    }

    /**
     * Your BSTIterator object will be instantiated and called as such:
     * BSTIterator obj = new BSTIterator(root);
     * int param_1 = obj.next();
     * boolean param_2 = obj.hasNext();
     */
}