package tree.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class rightSideView {
        class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            // normal bfs
            List<Integer>answer = new ArrayList<>();

            if(root == null) return answer;

            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                int size = q.size();
                while(size > 0){
                    TreeNode temp = q.remove(); 
                    if(temp.left != null){
                        q.add(temp.left);
                    }
                    if(temp.right != null){
                        q.add(temp.right);
                    }
                    // main code to get right view
                    size--;
                    if(size == 0){
                        answer.add(temp.val);
                    }
                }
            }
            return answer;
        }
    }
}

