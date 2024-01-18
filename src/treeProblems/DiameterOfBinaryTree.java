package src.treeProblems;

public class DiameterOfBinaryTree {
    // https://leetcode.com/problems/diameter-of-binary-tree/description/
    // https://www.geeksforgeeks.org/problems/diameter-of-binary-tree/1

    class Solution {
        int diameter = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            // Your code here
            dfs(root);
            return diameter - 1;
        }

        private int dfs(TreeNode root) {

            if (root == null) {
                return 0;
            }

            int left = dfs(root.left);
            int right = dfs(root.right);

            int temp = left + right + 1;
            diameter = Math.max(temp, diameter);
            return Math.max(left, right) + 1;
        }
    }
}
