package src.treeProblems;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    // https://leetcode.com/problems/symmetric-tree/description/

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public boolean isSymmetric(TreeNode root) {

            Queue<TreeNode> q = new LinkedList<>();
            q.add(root.left);
            q.add(root.right);
            while (!q.isEmpty()) {
                TreeNode left = q.remove();
                TreeNode right = q.remove();

                if (left == null && right == null) {
                    continue;
                }
                if (left == null || right == null) {
                    return false;
                }
                if (left.val != right.val) {
                    return false;
                }
                q.add(left.left);
                q.add(right.right);
                q.add(left.right);
                q.add(right.left);
            }
            return true;
        }

        // https://www.geeksforgeeks.org/problems/symmetric-tree/1?page=1&category=Tree,Binary%20Search%20Tree&difficulty=Easy&sortBy=submissions
        public static boolean isSymmetric(Node root) {
            if (root == null) {
                return true;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root.left);
            q.add(root.right);
            while (!q.isEmpty()) {
                Node left = q.remove();
                Node right = q.remove();

                if (left == null && right == null) {
                    continue;
                }
                if (left == null || right == null) {
                    return false;
                }
                if (left.data != right.data) {
                    return false;
                }
                q.add(left.left);
                q.add(right.right);
                q.add(left.right);
                q.add(right.left);
            }
            return true;
        }
    }
}
