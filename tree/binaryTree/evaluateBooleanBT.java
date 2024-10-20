package tree.binaryTree;

import javax.swing.tree.TreeNode;

public class evaluateBooleanBT {
    public boolean evaluateTree(TreeNode root) {
        
        // DFS -> PostOrder

        if(root.left == null && root.right == null){
            return (root.val == 1) ? true : false;
        }
        boolean left = false;
        boolean right = false;
        
        // calculate left and right boolean value 

        if(root.left != null){
            left = evaluateTree(root.left);
        }
        if(root.right != null){
            right = evaluateTree(root.right);
        }
        boolean result = false;

        //evaluate the root using left and right child value
        if(root.val == 2){
            result = (left || right) ? true : false;
        }
        else if(root.val == 3){
            result = (left && right) ? true : false;
        }
        return result;
    }
}
