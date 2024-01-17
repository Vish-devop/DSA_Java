package src.treeProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigZagLevelOrderTraversal {
    // https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/

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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> levelOrder = new ArrayList<>();
            levelOrder(root, levelOrder);
            for (int i = 0; i < levelOrder.size(); i++) {
                if (i % 2 != 0) {
                    Collections.reverse(levelOrder.get(i));
                }
            }
            return levelOrder;
        }

        private void levelOrder(TreeNode root, List<List<Integer>> levelOrder) {
            if (root == null) {
                return;
            }
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                int n = q.size();
                List<Integer> temp = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    TreeNode treeNode = q.remove();
                    if (treeNode.left != null) {
                        q.add(treeNode.left);
                    }
                    if (treeNode.right != null) {
                        q.add(treeNode.right);
                    }
                    temp.add(treeNode.val);
                }
                levelOrder.add(temp);
            }
        }
    }
}
