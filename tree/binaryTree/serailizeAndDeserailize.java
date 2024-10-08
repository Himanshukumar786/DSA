package tree.binaryTree;

import javax.swing.tree.TreeNode;

public class serailizeAndDeserailize {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 step 1-(serialize)-> convert tree into string form using delimiter (",") which separates with comma to know the null which tells us left and right of tree
 
 step 2-(deserialize)-> again convert string into tree form by storing in the string[] arr and deserialize(arr);
 */
public class Codec {

        public static void serialize(TreeNode root,StringBuilder sb)
        {
            if(root == null)
            {
                sb.append("null,");
                return;
            }
            sb.append(root.val + ",");
            serialize(root.left,sb);
            serialize(root.right,sb);
        }

        // Encodes a tree to a single string.

        public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(root,sb);
        return sb.toString();
        }
        
        int idx = 0;
        public TreeNode deserialize(String[] arr){
            if(idx >= arr.length || arr[idx].equals("null"))
            {
            idx++;
            return null;
            }
            TreeNode node = new TreeNode(Integer.parseInt(arr[idx++]));
            node.left = deserialize(arr);
            node.right = deserialize(arr);
            
            return node;
            
        }
        
        // Decodes your encoded data to tree.
        
        public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        return deserialize(arr);
        }
    }
}
