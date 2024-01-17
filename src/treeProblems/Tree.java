package src.treeProblems;

import java.util.Scanner;

public class Tree {

    public Tree() {}

    private TreeNode root;

    // INSERT ELEMENTS
    public TreeNode populate(Scanner scanner) {
        System.out.println("Enter the value of Root node ");
        int val = scanner.nextInt();

        root = new TreeNode(val);
        populate(scanner, root);
        return root;
    }

    private void populate(Scanner scanner, TreeNode root) {
        System.out.println("Do you want to insert left node of " + root.val);
        boolean left = scanner.nextBoolean();

        if(left) {
            System.out.println("Enter the value of left child " + root.val);
            int val = scanner.nextInt();
            root.left = new TreeNode(val);
            populate(scanner, root.left);
        }

        System.out.println("Do you want to insert right node of " + root.val);
        boolean right = scanner.nextBoolean();
        if(right) {
            System.out.println("Enter the value of right child " + root.val);
            int val = scanner.nextInt();
            root.right = new TreeNode(val);
            populate(scanner, root.right);
        }
    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {

    }

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
