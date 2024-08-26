package tree.binaryTree;

public class N-AryTree-POT {
    class Solution {
        // simple dfs preorder -> having children property , added into the list and return list
        // using for each loop bcs question having only children and val property 
        public void dfsfn(Node root, List<Integer> list){
            
            if(root == null) return ;
            for(Node child : root.children){
                dfsfn(child, list);
            }
            list.add(root.val);
        }
        public List<Integer> postorder(Node root) {
            List<Integer> list = new ArrayList<>();
            dfsfn(root, list);
            return list;
        }
    }
}
