package src.treeProblems;

public class ConstructBinaryTreeFromPreorderAndInorder {
    // https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/

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
        private int i = 0;
        private int p = 0;

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return build(preorder, inorder, Integer.MIN_VALUE);
        }

        private TreeNode build(int[] preorder, int[] inorder, int stop) {
            if (p >= preorder.length) {
                return null;
            }
            if (inorder[i] == stop) {
                ++i;
                return null;
            }

            TreeNode node = new TreeNode(preorder[p++]);
            node.left = build(preorder, inorder, node.val);
            node.right = build(preorder, inorder, stop);
            return node;
        }
    }
    // class Solution {
    //     public TreeNode buildTree(int[] preorder, int[] inorder) {
    //         return buildTree(preorder, 0, inorder, 0, preorder.length);

    //     }
    //     private TreeNode buildTree(int[] preorder, int idx, int[] inorder, int start, int end) {
    //         if (idx > preorder.length - 1 || start > end) {
    //             return null;
    //         }

    //         TreeNode root = new TreeNode(preorder[idx]);
    //         int index = getIndex(inorder, preorder[idx], start, end);

    //         root.left = buildTree(preorder, idx + 1, inorder, start, index - 1);
    //         root.right = buildTree(preorder, idx + (index - start) + 1, inorder, index + 1, end);

    //         return root;
    //     }

    //     private int getIndex(int[] arr, int k, int start, int end) {
    //         for (int i = start; i <= end; i++) {
    //             if (arr[i] == k) {
    //                 return i;
    //             }
    //         }
    //         return -1;
    //     }
    // }
}
