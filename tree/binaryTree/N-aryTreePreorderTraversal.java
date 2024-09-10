package tree.binaryTree;

public class N-aryTreePreorderTraversal {
    class Solution {
        // simple dfs -> having children property , added into the list and return list
        // using for each loop bcs question having only children and val property 
        // same as N-ary Tree Postorder Traversal
        public void dfsfn(Node root, List<Integer> list){
            
            if(root == null) return ;
            
            // first add root
            list.add(root.val);
            
            // then left child and right child
            for(Node child : root.children){
                dfsfn(child, list);
            }
        }
        
        public List<Integer> preorder(Node root) {
            
            List<Integer> list = new ArrayList<>();
            dfsfn(root, list);
            return list;
        }
    }
}
