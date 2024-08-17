import javax.swing.tree.TreeNode;

public class sameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // below condition should be in order 1-> && 2->||
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        // when all three condition is true then get the answer otherwise false
        return (p.val == q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
