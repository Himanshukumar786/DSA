package Strings;

public class Construct_K_Palindrome_Strings {
    class Solution {
        public boolean canConstruct(String s, int k) {
            int n = s.length();
    
            if(n == k) return true;
            if(k > n) return false;
    
            int[] vec = new int[26];
            for(char ch : s.toCharArray()){
                vec[ch - 'a']++;
            }
    
            int oddCount = 0;
            for(int i = 0; i < 26; i++){
                if(vec[i] % 2 != 0) oddCount++;
            }
    
            return (oddCount <= k);
        }
    }
}
