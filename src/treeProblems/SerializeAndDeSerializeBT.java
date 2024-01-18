package src.treeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SerializeAndDeSerializeBT {

    // https://leetcode.com/problems/serialize-and-deserialize-binary-tree/description/

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            List<String> arr = new ArrayList<>();
            getListOfStringForSerialization(root, arr);
            StringBuffer str = new StringBuffer();
            for(String x: arr) {
                str.append(x + ",");
            }
            return str.toString();
        }


        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if(data.equals("null,")) {
                return null;
            }
            String[] arr = data.split(",");
            Collections.reverse(Arrays.asList(arr));

            TreeNode root = helpMeToDeseralize(new ArrayList<>(Arrays.asList(arr)));
            return root;
        }

        private TreeNode helpMeToDeseralize(List<String> arr) {
            String val = arr.remove(arr.size() -1);
            if(val.equals("null")) {
                return null;
            }

            TreeNode root = new TreeNode(Integer.parseInt(val));
            root.left = helpMeToDeseralize(arr);
            root.right = helpMeToDeseralize(arr);
            return root;
        }

        private void getListOfStringForSerialization(TreeNode root, List<String> arr) {
            if(root == null) {
                arr.add("null");
                return ;
            }
            arr.add(String.valueOf(root.val));
            getListOfStringForSerialization(root.left, arr);
            getListOfStringForSerialization(root.right, arr);
        }
    }

    // Your Codec object will be instantiated and called as such:
    // Codec ser = new Codec();
    // Codec deser = new Codec();
    // TreeNode ans = deser.deserialize(ser.serialize(root));
}
