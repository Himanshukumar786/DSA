package tree.binaryTree;

import javax.swing.tree.TreeNode;

public class countCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        // ans -> total no. of nodes having binary tree
        if(root == null) return 0;
        
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        
        return leftCount + rightCount + 1;
    }
}
