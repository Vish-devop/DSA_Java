package src.treeProblems;

public class DetermineIfTwoTreeAreIdentical {
    // https://www.geeksforgeeks.org/problems/determine-if-two-trees-are-identical/1?page=1&category=Tree,Binary%20Search%20Tree&difficulty=Easy&sortBy=submissions

    class Solution {
        //Function to check if two trees are identical.
        boolean isIdentical(Node root1, Node root2) {
            // Code Here
            if (root1 == null && root2 == null) {
                return true;
            }
            if (root1 == null) {
                return false;
            }
            if (root2 == null) {
                return false;
            }
            if (root1.data != root2.data) {
                return false;
            }
            if (!isIdentical(root1.left, root2.left)) {
                return false;
            }
            if (!isIdentical(root1.right, root2.right)) {
                return false;
            }
            return true;
        }
    }
}
