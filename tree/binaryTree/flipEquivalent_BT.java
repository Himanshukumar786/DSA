package tree.binaryTree;

import javax.swing.tree.TreeNode;

public class flipEquivalent_BT {
        class Solution {
        
        public boolean flip(TreeNode root1, TreeNode root2){
            // chcek all edge cases
            if(root1 == null && root2 == null) return true;
            if(root1 == null || root2 == null) return false;
            
            // if(root1.val == root2.val) return true;
            // above comment condition gives wrong answer for anyone test case 
            //  test case ->  [1,2,3] , [1,2,null,3]
            
            if(root1.val != root2.val) return false;
            
            // simple comparing nodes of root1  and root2
            // check for identical and flip both 
            
            return flip(root1.left, root2.left) && flip(root1.right, root2.right) || flip(root1.left, root2.right) && flip(root2.left, root1.right);
        }
        public boolean flipEquiv(TreeNode root1, TreeNode root2) {
            return flip(root1, root2);
            
        }
    }
}
