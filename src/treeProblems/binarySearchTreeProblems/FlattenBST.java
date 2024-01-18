package src.treeProblems.binarySearchTreeProblems;

public class FlattenBST {

    // https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/

    // Definition for a binary tree node.
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

    class Solution {

        public void flatten(TreeNode root) {
            TreeNode curr = root;
            while (curr != null) {

                TreeNode temp = curr.left;
                if (temp == null) {
                    curr = curr.right;
                    continue;
                }
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
                curr = curr.right;
            }
        }
        // public void flatten(TreeNode root) {
        //     Queue<TreeNode> q = new LinkedList<>();
        //     populateLinkedList(root, q);
        //     root = q.poll();
        //     TreeNode temp = root;
        //     while(!q.isEmpty()) {
        //         TreeNode node = q.poll();
        //         temp.left = null;
        //         temp.right = node;
        //         temp = node;
        //     }

        // }

        // private void populateLinkedList(TreeNode root, Queue<TreeNode> q) {
        //     if(root == null) {
        //         return ;
        //     }

        //     q.add(root);
        //     populateLinkedList(root.left, q);
        //     populatetLinkedList(root.right, q);
        // }
    }
}
