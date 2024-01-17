package src.treeProblems;

public class LowestCommonAncestor {
    //https://www.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-bst/1?page=1&category=Tree,Binary%20Search%20Tree&difficulty=Easy&sortBy=submissions

    class BST {
        //Function to find the lowest common ancestor in a BST.
        Node LCA(Node root, int n1, int n2) {
            if (root == null || root.data == n1 || root.data == n2) {
                return root;
            }

            Node left = LCA(root.left, n1, n2);
            Node right = LCA(root.right, n1, n2);

            if (left == null) {
                return right;
            }
            if (right == null) {
                return left;
            }
            return root;
        }
        // 	Node LCA(Node root, int n1, int n2)
        //     {
        //         // Check if the root is null
        //         if (root == null) {
        //             return null;
        //         }

        //         List<Node> a = new ArrayList<>();
        //         List<Node> b = new ArrayList<>();

        //         if (!findPath(root, n1, a) || !findPath(root, n2, b)) {
        //             return null;
        //         }

        //         for (int i = 1; i < Math.min(a.size(), b.size()); i++) {
        //             if (a.get(i).data != b.get(i).data) {
        //                 return a.get(i - 1);
        //             }
        //         }

        //         return a.size() < b.size() ? a.get(a.size() - 1) : b.get(b.size() - 1);
        //     }

        //     private boolean findPath(Node root, int n, List<Node> arr) {
        //         if (root == null) {
        //             return false; // Node not found
        //         }

        //         if (root.data == n) {
        //             arr.add(root);
        //             return true; // Node found
        //         }

        //         arr.add(root);

        //         if (n < root.data) {
        //             // Search in the left subtree
        //             return findPath(root.left, n, arr);
        //         } else {
        //             // Search in the right subtree
        //             return findPath(root.right, n, arr);
        //         }
        //     }
    }
}
