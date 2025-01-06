package prefixSum;

import java.util.HashSet;

public class Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box {
    
    // TC -> O(N^N)
    // SC -> O(N)

    class Solution {
        public int[] minOperations(String boxes) {
            int n = boxes.length();

            HashSet<Integer> set = new HashSet<>();
            for(int i = 0; i < n; i++){
                if(boxes.charAt(i) == '1'){
                    set.add(i); // index
                }
            }

            int[] ans = new int[n];

            for(int i = 0; i < n; i++){
                for(int idx : set){
                    ans[i] += Math.abs(i - idx);
                }
            }
            return ans;
        }
    }
}
