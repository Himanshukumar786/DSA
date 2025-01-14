package Strings;

public class Minimum_Length_of_String_After_Operations {
    class Solution {
        public int minimumLength(String s) {
            int n = s.length();
    
            int[] freq = new int[26];
            int delete = 0;
    
            for(int i = 0; i < n; i++){
                freq[s.charAt(i) - 'a']++;
    
                if(freq[s.charAt(i) - 'a'] == 3){
                    freq[s.charAt(i) - 'a'] -= 2;
                    delete += 2;
                }
            }
            return n - delete;
        }
    }
}
