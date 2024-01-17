package src.treeProblems;

public class CheckedBalancedBinaryTree {
    //https://www.geeksforgeeks.org/problems/check-for-balanced-tree/1?page=1&category=Tree,Binary%20Search%20Tree&difficulty=Easy&sortBy=submissions
    class Tree {

        //Function to check whether a binary tree is balanced or not.
        boolean isBalanced(Node root) {
            // Your code here
            if (root == null) {
                return true;
            }

            return dfs(root) != -1;
        }

        private int dfs(Node root) {
            if (root == null) {
                return 0;
            }

            int left = dfs(root.left);
            if (left == -1) {
                return -1;
            }
            int right = dfs(root.right);
            if (right == -1) {
                return -1;
            }

            if (Math.abs(left - right) > 1) {
                return -1;
            }
            return Math.max(left, right) + 1;
        }
    }
}
