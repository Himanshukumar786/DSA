package tree.BST;

import javax.swing.tree.TreeNode;

public class LCA_0f_BST {
    
    // simple BST approach 
    // other way is we can separate checks(if) conditions for root , p , and q.
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // going left
        if(root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
        // going right
        else if(root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        // if above both condition is not true that means p and q is root or root equals to null.
        else return root;
    } 
}
