package Strings;

public class ReverseString {
    public void reverseString(char[] s) {
        // we can use stringbuilder but the
        // given is already a char[] aaray not a string so use simple pointer approach
        int n = s.length;
        
        for(int i=0; i<n/2; i++){
            char tmp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = tmp;
        }
    }
}
