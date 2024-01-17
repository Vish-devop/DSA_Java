package src.treeProblems;

public class CousinsInBinaryTree {
    // https://leetcode.com/problems/cousins-in-binary-tree/description/

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
        public boolean isCousins(TreeNode root, int x, int y) {
            if (root == null) {
                return false;
            }

            TreeNode X = findNode(root, x);
            TreeNode Y = findNode(root, y);

            return (!isSibling(root, X, Y)) && (findLevel(root, X, 0) == findLevel(root, Y, 0));
        }

        private int findLevel(TreeNode root, TreeNode n, int level) {
            if (root == null) return 0;

            if (root == n) {
                return level;
            }
            int temp = findLevel(root.left, n, level + 1);
            if (temp != 0) {
                return temp;
            }
            return findLevel(root.right, n, level + 1);
        }

        private boolean isSibling(TreeNode root, TreeNode a, TreeNode b) {
            if (root == null) return false;

            return (root.left == a && root.right == b) || (root.left == b && root.right == a) || (
                isSibling(root.left, a, b)
                    || isSibling(root.right, a, b));
        }

        private TreeNode findNode(TreeNode root, int n) {
            if (root == null || root.val == n) return root;

            TreeNode left = findNode(root.left, n);
            if (left != null) {
                return left;
            }
            return findNode(root.right, n);
        }
    }
}
