package src.treeProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {
    // https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1?page=1&category=Tree,Binary%20Search%20Tree&difficulty=Easy&sortBy=submissions
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node node) {
        // Your code here

        ArrayList<Integer> ans = new ArrayList<>();
        if (node == null) {
            return ans;
        }

        bfs(node, ans);

        return ans;
    }

    private void bfs(Node root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();

            for (int i = 0; i < n; i++) {
                Node node = q.remove();
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
                if (i == 0) {
                    ans.add(node.data);
                }
            }
        }
    }
}

