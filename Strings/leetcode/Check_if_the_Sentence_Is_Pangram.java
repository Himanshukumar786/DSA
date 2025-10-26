package Strings.leetcode;
import java.util.*;

class Solution {
    public boolean checkIfPangram(String sentence) {
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : sentence.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        return map.size() == 26;
    }
}