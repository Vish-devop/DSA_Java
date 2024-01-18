package src.treeProblems;

public class MaxPathSumOfBT {
    // https://leetcode.com/problems/binary-tree-maximum-path-sum/
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        private int ans = Integer.MIN_VALUE;

        public int maxPathSum(TreeNode root) {
            if(root == null) return 0;
            maxPathSumHelper(root);
            return ans;
        }

        private int maxPathSumHelper(TreeNode root) {
            if(root == null) return 0;

            int left = maxPathSumHelper(root.left);
            int right = maxPathSumHelper(root.right);

            left = Math.max(0, left);
            right = Math.max(0, right);
            int sum = left + right + root.val;
            ans = Math.max(sum, ans);

            return Math.max(left, right) + root.val;
        }
    }
}
