package tree.binaryTree;

import javax.swing.tree.TreeNode;

public class constructBTUsing_pre_nd_Inorder {
    class Solution {
    // we can use hashmap instead of while loop to reduce comlexity
    
        public TreeNode buildBothTree(int[] preorder, int psi, int pei, int[] inorder, int isi, int iei) {
            if(isi > iei) return null;
            
            int idx = isi;
            
            while(inorder[idx] != preorder[psi]) idx++;
            int colse = idx - isi;
            
            TreeNode node = new TreeNode(preorder[psi]);
            
            node.left = buildBothTree(preorder, psi + 1, psi +  colse, inorder, isi, idx - 1);
            
            node.right = buildBothTree(preorder, psi + colse + 1, psi, inorder, idx + 1, iei);
            
            return node;
        }
        
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            int n = preorder.length;
            
            return buildBothTree(preorder, 0, n-1, inorder, 0, n-1);
        }
    }
}
