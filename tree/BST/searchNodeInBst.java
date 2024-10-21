package tree.BST;

import javax.swing.tree.TreeNode;

public class searchNodeInBst {
    public TreeNode searchBST(TreeNode root, int val) {
        
        if(root == null) return null;
        
        // for finding the value
        if(root.val == val) return root;
        
        TreeNode leftsubtree = searchBST(root.left, val);
        TreeNode rightsubtree = searchBST(root.right, val);
        
        // which subtree is not null is returned
        return rightsubtree != null  ? rightsubtree : leftsubtree;
    }
}
