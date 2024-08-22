package tree.binaryTree;

import javax.swing.tree.TreeNode;

public class constructBTUsing_In_nd_Postorder {
    class Solution {
    // make the range condition of node.left and node.right
    
        public TreeNode buildBothTree(int[] postorder, int psi, int pei, int[] inorder, int isi, int iei) {
            if(psi > pei) return null;
            
            int idx = isi;
            
            while(inorder[idx] != postorder[pei]) idx++;
            int tnel = idx - isi;
            
            TreeNode node = new TreeNode(postorder[pei]);
            
            node.left = buildBothTree(postorder, psi, psi +  tnel - 1, inorder, isi, idx - 1);
            
            node.right = buildBothTree(postorder, psi + tnel, pei - 1, inorder, idx + 1, iei);
            
            return node;
        }
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            
            int n = inorder.length;
            
            return buildBothTree(postorder, 0, n - 1, inorder, 0, n - 1);
            
        }
    }
}
