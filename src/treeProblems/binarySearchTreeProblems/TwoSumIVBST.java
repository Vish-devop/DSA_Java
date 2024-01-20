package src.treeProblems.binarySearchTreeProblems;

import java.util.Stack;
import src.treeProblems.binarySearchTreeProblems.BSTIterator.TreeNode;

public class TwoSumIVBST {

    // https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
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

    class BSTIterator {

        private Stack<TreeNode> stack;
        private boolean isReverse;

        public BSTIterator(TreeNode root, boolean isReverse) {
            this.stack = new Stack<>();
            this.isReverse = isReverse;
            populateBSTIterator(root);
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }

        public int next() {
            TreeNode temp = stack.pop();
            if(isReverse) populateBSTIterator(temp.left);
            else populateBSTIterator(temp.right);
            return temp.val;
        }

        private void populateBSTIterator(TreeNode root) {
            while(root != null) {
                stack.push(root);
                if(isReverse) {
                    root = root.right;
                }
                else {
                    root = root.left;
                }
            }
        }
    }
    class Solution {
        public boolean findTarget(TreeNode root, int k) {
            BSTIterator left = new BSTIterator(root, false);
            BSTIterator right = new BSTIterator(root, true);

            int lVal = left.next();
            int rVal = right.next();
            while(lVal < rVal) {
                if(lVal + rVal == k) {
                    return true;
                }
                else if(lVal + rVal < k) {
                    lVal = left.next();
                }
                else {
                    rVal = right.next();
                }
            }
            return false;
        }
    }
}
