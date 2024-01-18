package src.treeProblems;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepthOfBinaryTree {
    // https://leetcode.com/problems/minimum-depth-of-binary-tree/
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public int minDepth(TreeNode root) {
            if(root == null) return 0;

            int ans = 0;
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()) {
                int n = q.size();
                for(int i = 0; i < n; i++) {
                    TreeNode node = q.remove();
                    if(node.left == null && node.right == null) {
                        return ans + 1;
                    }
                    if(node.left != null) {
                        q.add(node.left);
                    }
                    if(node.right != null) {
                        q.add(node.right);
                    }
                }
                ans++;
            }
            return ans;
        }
        // public int minDepth(TreeNode root) {
        //     if (root == null) {
        //         return 0;
        //     }
        //     if (root.left == null && root.right == null) {
        //         return 1;
        //     }
        //     if (root.left == null) {
        //         return minDepth(root.right) + 1;
        //     }
        //     if (root.right == null) {
        //         return minDepth(root.left) + 1;
        //     }
        //     int left = minDepth(root.left);
        //     int right = minDepth(root.right);

        //     return Math.min(left, right) + 1;
        // }
    }
}
