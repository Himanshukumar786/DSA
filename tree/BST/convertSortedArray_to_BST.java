package tree.BST;

import javax.swing.tree.TreeNode;

public class convertSortedArray_to_BST {
    class Solution {
    
        public TreeNode binarySearch(int[] nums, int lo, int hi){
            
            // binary search recursively
            if(lo > hi) return null;
            int mid = lo + (hi - lo)/2;
            
            TreeNode root = new TreeNode(nums[mid]); // mid became the root
            
            // recursively go left 
            root.left = binarySearch(nums, lo, mid - 1);

            // recursively go right 
            root.right = binarySearch(nums, mid + 1, hi);
            
            return root;
        }
        public TreeNode sortedArrayToBST(int[] nums) {
            int n = nums.length;
            
            // passing the range for binary search
            
            return binarySearch(nums, 0, n-1);
        }
    }
}
