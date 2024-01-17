package src.treeProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BottomUpLevelOrderTraversal {
    // https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/

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
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();

            if (root == null) {
                return ans;
            }

            getLevelOrder(root, ans);
            reverse(ans);
            return ans;
        }

        private void reverse(List<List<Integer>> arr) {
            int i = 0;
            int j = arr.size() - 1;
            while (i < j) {
                List<Integer> temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                i++;
                j--;
            }
        }

        private void getLevelOrder(TreeNode root, List<List<Integer>> arr) {
            if (root == null) {
                return;
            }

            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            while (!q.isEmpty()) {
                int levelSize = q.size();

                List<Integer> temp = new ArrayList<>();
                for (int i = 0; i < levelSize; i++) {
                    TreeNode treeNode = q.poll();
                    temp.add(treeNode.val);
                    if (treeNode.left != null) {
                        q.add(treeNode.left);
                    }
                    if (treeNode.right != null) {
                        q.add(treeNode.right);
                    }
                }
                arr.add(temp);
            }
        }
    }
}
