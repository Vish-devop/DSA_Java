package src.treeProblems.binarySearchTreeProblems;

import java.util.List;

public class ConvertSortedListToBST {
    // https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
    // Definition for singly-linked list.
    public class ListNode {
        int val;

        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

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
        public TreeNode sortedListToBST(ListNode head) {
            // List<Integer> arr = new ArrayList<>();
            // ListNode temp = head;
            // while(temp != null) {
            //     arr.add(temp.val);
            //     temp = temp.next;
            // }
            // return createBST(arr, 0, arr.size() -1);
            if (head == null) return null;
            if (head.next == null) return new TreeNode(head.val);

            ListNode slow = head;
            ListNode fast = head.next.next;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            TreeNode root = new TreeNode(slow.next.val);
            ListNode rightHead = slow.next.next;
            slow.next = null;
            root.left = sortedListToBST(head);
            root.right = sortedListToBST(rightHead);

            return root;
        }

        private TreeNode createBST(List<Integer> arr, int start, int end) {
            if (start > end) {
                return null;
            }
            int mid = start + (end - start) / 2;
            TreeNode root = new TreeNode(arr.get(mid));
            root.left = createBST(arr, start, mid - 1);
            root.right = createBST(arr, mid + 1, end);
            return root;
        }
    }
}
