package tree.BST;

import javax.swing.tree.TreeNode;

public class InsertIntoBST {
    class Solution {
    // a simple BST insert based upon the set of copmared value where is left and right
    
        public TreeNode nBst(TreeNode root, int val){
            if(root == null) return new TreeNode(val);
            
            if(root.val > val){
                root.left = nBst(root.left, val);
            } else {
                root.right = nBst(root.right, val);
            }
            return root;
        }
        
        public TreeNode insertIntoBST(TreeNode root, int val) {
            
            return nBst(root, val);
        }
    }
}
