package tree.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class reverse_levelOrder {
    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>>answer = new ArrayList<>();

            if(root == null)
            return answer;

            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);

            while(q.size() > 0){
                int size = q.size();
                List<Integer> ans = new ArrayList<>();
                while(size-- > 0){
                    TreeNode temp = q.remove(); //got poped
                
                    if(temp.left != null){
                        q.add(temp.left);
                    }
                    
                    if(temp.right != null){
                        q.add(temp.right);
                    }
                    

                    ans.add(temp.val);
                }
                answer.add(ans);
                System.out.print(answer);
                
            }
            // List<List<Integer>> realAns = new ArrayList<>();
            // for(int i = answer.size()-1;i>=0;i--){
            //     realAns.add(answer.get(i));
            // }
            
            List<List<Integer>> realAns = new ArrayList<>();
            int i = answer.size() - 1;
            while (i >= 0) {
                realAns.add(answer.get(i));
                i--;
            }
            return realAns;
        }
    }
}
