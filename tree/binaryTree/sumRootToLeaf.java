package tree.binaryTree;

import javax.swing.tree.TreeNode;

public class sumRootToLeaf {
    class Solution {
        int ans=0;
        
        public int sum(TreeNode root, int num){

            if(root.left == null && root.right == null){
                ans += 10 * num + root.val;
            }
            
            int n = 10 * num + root.val;

            if(root.left != null){
                sum(root.left, n);
            }
            if(root.right != null){
                sum(root.right, n);
            }
            return ans;
        }
        
        public int sumNumbers(TreeNode root) {
            sum(root, 0);
            return ans;
        }
    }
}
