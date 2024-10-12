package tree.binaryTree;

import javax.swing.tree.TreeNode;

public class subTreeOfAnotherTree {
    class Solution {
    
        public boolean subTree(TreeNode r, TreeNode s){
            if(r == null && s == null) return true;
            if(r == null || s == null) return false;
            
            if(r.val != s.val) return false;
            
            return subTree(r.left, s.left) && subTree(r.right, s.right);

            
        }
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if(root == null) return false;
            if(subTree(root, subRoot)) return true;
            
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }
}
