package src.treeProblems;

public class InsertNodeInBinaryTree {
    // https://www.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1?page=1&category=Tree,Binary%20Search%20Tree&difficulty=Easy&sortBy=submissions
    class Solution {
        // Function to insert a node in a BST.
        Node insert(Node root, int key) {
            // your code here
            if (root == null) {
                root = new Node(key);
                return root;
            }
            if (root.data == key) {
                return root;
            }
            if (root.data > key) {
                root.left = insert(root.left, key);
            } else {
                root.right = insert(root.right, key);
            }
            return root;
        }
    }
}
