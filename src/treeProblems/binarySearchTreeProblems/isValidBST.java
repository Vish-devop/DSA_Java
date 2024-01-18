package src.treeProblems.binarySearchTreeProblems;

public class isValidBST {
    // https://leetcode.com/problems/validate-binary-search-tree/description/

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

    class Solution {
        public boolean isValidBST(TreeNode root) {
            return getIsValidBST(root, null, null);
        }

        private boolean getIsValidBST(TreeNode root, Integer l, Integer h) {
            if (root == null) {
                return true;
            }

            if ((l != null && l >= root.val) || (h != null && h <= root.val)) {
                return false;
            }
            boolean left = getIsValidBST(root.left, l, root.val);
            boolean right = getIsValidBST(root.right, root.val, h);

            return left && right;
        }
    }
}
