package src.treeProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversalInSpiralForm {
    // https://www.geeksforgeeks.org/problems/level-order-traversal-in-spiral-form/1?page=1&category=Tree,Binary%20Search%20Tree&difficulty=Easy&sortBy=submissions

    class Spiral {
        //Function to return a list containing the level order
        //traversal in spiral form.
        ArrayList<Integer> findSpiral(Node root) {
            // Your code here
            ArrayList<Integer> ans = new ArrayList<>();
            if (root == null) {
                return ans;
            }
            List<List<Node>> arr = new ArrayList<>();
            dfs(root, arr);
            return spiralTraversal(arr);
        }

        private ArrayList<Integer> spiralTraversal(List<List<Node>> arr) {
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(arr.get(0).get(0).data);
            int n = arr.size();
            for (int i = 1; i < n; i++) {
                if (i % 2 == 0) {
                    for (int j = arr.get(i).size() - 1; j >= 0; j--) {
                        ans.add(arr.get(i).get(j).data);
                    }
                } else {
                    for (int j = 0; j < arr.get(i).size(); j++) {
                        ans.add(arr.get(i).get(j).data);
                    }
                }
            }
            return ans;
        }

        private void dfs(Node root, List<List<Node>> arr) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();

            q.add(root);
            while (!q.isEmpty()) {
                int n = q.size();

                List<Node> temp = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    Node node = q.remove();
                    if (node.left != null) {
                        q.add(node.left);
                    }
                    if (node.right != null) {
                        q.add(node.right);
                    }
                    temp.add(node);
                }
                arr.add(temp);
            }
        }
    }
}
