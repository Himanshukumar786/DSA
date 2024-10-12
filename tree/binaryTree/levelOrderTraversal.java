package tree.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class levelOrderTraversal {

    class Solution {

        public List<List<Integer>> levelOrder(TreeNode root) {
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
            }
            return answer;
        }
	}
}
