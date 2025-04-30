package tree.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class AvgOfLevelInBT {
    public List<Double> averageOfLevels(TreeNode root) {
        
        // simple levelorder
        // make a list of double type nd add each level values nd get the avg nd add in list
        
        List<Double> res = new ArrayList<>();
        if(root == null) return res;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            
            int n = q.size();
            double total = 0.0;
            
            for(int i=0; i<n; i++){
                TreeNode temp = q.remove();

                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
                
                total += temp.val;
                System.out.print(total);
            }
            res.add(total/n);
        }
        return res;
    }
}
