package src.treeProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
    // https://leetcode.com/problems/average-of-levels-in-binary-tree/description/

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> ans = new ArrayList<>();
            getAvgLevelsOfBT(root, ans);
            return ans;
        }

        private void getAvgLevelsOfBT(TreeNode root, List<Double> arr) {
            if (root == null) {
                return;
            }
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            while (!q.isEmpty()) {
                int levelSize = q.size();
                Double sum = 0.0;
                for (int i = 0; i < levelSize; i++) {
                    TreeNode treeNode = q.poll();
                    sum += treeNode.val;
                    if (treeNode.left != null) {
                        q.offer(treeNode.left);
                    }
                    if (treeNode.right != null) {
                        q.offer(treeNode.right);
                    }
                }
                arr.add(sum / levelSize);
            }
        }
    }
}
