package tree.binaryTree;

import javax.swing.tree.TreeNode;

public class rootEqualSumOfChilds {
        class Solution {
            
        // simple straight forward que -> value of root == sum of their childs value
        public boolean checkTree(TreeNode root) {
            return (root.val) == (root.left.val) + (root.right.val);
        }
    }
}
