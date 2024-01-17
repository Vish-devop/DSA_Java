package src.treeProblems;

import java.util.Scanner;
import src.treeProblems.Tree;
import src.treeProblems.TreeNode;

public class Main {
    public static void main(String[] args) {
        System.out.println("ankit");
        Scanner scanner = new Scanner(System.in);
        Tree tree = new Tree();
        TreeNode root = tree.populate(scanner);
        inorder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }

    private static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    private static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
}
