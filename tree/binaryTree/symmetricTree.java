package tree.binaryTree;

import javax.swing.tree.TreeNode;

public class symmetricTree {
    class Solution {
    
        public boolean checkMirror(TreeNode l, TreeNode r){
            if(l == null && r == null) return true;
            if(l == null || r == null) return false;
            
            if(l.val == r.val && checkMirror(l.left, r.right) && checkMirror(l.right, r.left)) return true;
            
            return false;
        }
        
        public boolean isSymmetric(TreeNode root) {
            // (root == null) -> (!root)
            if(root == null) return true;
            
            return checkMirror(root.left, root.right);
        }
    }
}
