package arrays_and_hashing;

import java.util.Arrays;

    public class containsDuplicate_I {
        class Solution {
        public boolean containsDuplicate(int[] nums) {
            // sort array will take o(n) compleity
            // better approch is using hashmap
            Arrays.sort(nums);
            
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i+1]){
                    return true;
                }
            }
            return false;
        }
    }
}
