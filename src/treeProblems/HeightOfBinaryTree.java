package src.treeProblems;

public class HeightOfBinaryTree {
    // https://www.geeksforgeeks.org/problems/height-of-binary-tree/1?page=1&category=Tree,Binary%20Search%20Tree&difficulty=Easy&sortBy=submissions

    class Solution {
        //Function to find the height of a binary tree.
        int height(Node node) {
            // code here
            if (node == null) {
                return 0;
            }

            int left = height(node.left);
            int right = height(node.right);

            return Math.max(left, right) + 1;
        }
    }
}
