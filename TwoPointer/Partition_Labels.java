package TwoPointer;

import java.util.ArrayList;
import java.util.List;

public class Partition_Labels {
    class Solution {
        public List<Integer> partitionLabels(String s) {
            int n = s.length();
            
            List<Integer> ans = new ArrayList<>();
            int[] map = new int[26];

            for(int i = 0; i < n; i++){
                // int index = s.charAt(i) - 'a';
                // map[index] = i;
                
                map[s.charAt(i) - 'a'] = i;
            }

            int i = 0;
            while(i < n){
                int end = map[s.charAt(i) - 'a'];
                int j = i;
                while(j < end){
                    end = Math.max(end, map[s.charAt(j) - 'a']);
                    j++;
                }
                ans.add(j - i + 1);
                i = j + 1;
            }
            return ans;
        }
    }
}
