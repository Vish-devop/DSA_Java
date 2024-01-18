package src.treeProblems;

public class PathSumOfBT {
    // https://leetcode.com/problems/path-sum/description/

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
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if(root == null || root.left == null && root.right == null && root.val != targetSum) {
                return false;
            }
            if(root.left == null && root.right == null && root.val == targetSum) {
                return true;
            }
            int sum = targetSum - root.val;
            boolean left = hasPathSum(root.left, sum);
            boolean right = hasPathSum(root.right, sum);
            return (left || right);
        }
    }
}
