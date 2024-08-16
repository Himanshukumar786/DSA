package tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class cousinBinarytree {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int childcount = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            // check at same level
            for(int i=0; i<size; i++){
                TreeNode temp = q.remove();
                int sameparentcount = 0;
                if(temp.left != null){
                    if(temp.left.val == x || temp.left.val == y){                    
                        sameparentcount++;
                        childcount++;
                    }
                    q.add(temp.left);
                }
                if(temp.right != null){
                    if(temp.right.val == x || temp.right.val == y){
                        sameparentcount++;
                        childcount++;
                    }
                    q.add(temp.right);
                }
                if(sameparentcount == 2){
                    return false;
                }
                
            }
            if(childcount == 2){
                return true;
            }
            if(childcount == 1){
                return false;
            }
        }
        return false;
    }
}
