package src.treeProblems.binarySearchTreeProblems;

public class KthSmallestElementInBST {
    // https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
    // Definition for a binary tree node.
    public class TreeNode {
        int val;

        TreeNode left;

        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        private int count = 0;

        public int kthSmallest(TreeNode root, int k) {
            return helper(root, k).val;
        }

        private TreeNode helper(TreeNode root, int k) {
            if (root == null) return null;

            TreeNode left = helper(root.left, k);
            if (left != null) {
                return left;
            }
            count++;
            if (count == k) return root;

            return helper(root.right, k);
        }
        // public int kthSmallest(TreeNode root, int k) {
        //     List<Integer> arr = new ArrayList<>();
        //     inorder(root, arr);
        //     return arr.get(k-1);
        // }
        // private void inorder(TreeNode root, List<Integer> arr) {
        //     if(root == null ) {
        //         return;
        //     }
        //     inorder(root.left, arr);
        //     arr.add(root.val);
        //     inorder(root.right, arr);
        // }
    }
}
