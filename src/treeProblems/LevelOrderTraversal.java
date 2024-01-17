package src.treeProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    // https://www.geeksforgeeks.org/problems/level-order-traversal/1?page=1&category=Tree,Binary%20Search%20Tree&difficulty=Easy&sortBy=submissions
    // https://leetcode.com/problems/binary-tree-level-order-traversal/description/
    class Solution {
        //Function to return the level order traversal of a tree.
        static ArrayList<Integer> levelOrder(Node node) {
            // Your code here
            ArrayList<Integer> ans = new ArrayList<>();

            if (node == null) {
                return ans;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(node);
            while (!q.isEmpty()) {
                int n = q.size();
                for (int i = 0; i < n; i++) {
                    Node temp = q.remove();
                    if (temp.left != null) {
                        q.add(temp.left);
                    }
                    if (temp.right != null) {
                        q.add(temp.right);
                    }
                    ans.add(temp.data);
                }
            }
            return ans;
        }
    }
}
