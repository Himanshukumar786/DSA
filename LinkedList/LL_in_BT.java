package LinkedList;

import javax.swing.tree.TreeNode;

public class LL_in_BT {
    class Solution {
    
        public boolean dfs(ListNode head, TreeNode node){
            
            if(head == null) return true;
            
            // if node becomes null but ll not 
            if(node == null) return false;
            
            // check the first value of head == node
            if(head.val != node.val) return false;
            
            // head.next means the second values of the head and node
            return dfs(head.next, node.left) || dfs(head.next, node.right);
        }
        public boolean isSubPath(ListNode head, TreeNode root) {
            
            // dfs -> preorder approach
            if(root == null) return false;
            
            if(root.val == head.val){
                // inner dfs 
                if(dfs(head, root)) return true;
            }
            
            return isSubPath(head, root.left) || isSubPath(head, root.right);
        }
    }
}
