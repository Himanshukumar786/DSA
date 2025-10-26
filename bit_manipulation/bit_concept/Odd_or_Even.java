package bit_manipulation.bit_concept;

public class Odd_or_Even {
    class Solution {
        static boolean isEven(int n) {
            // code here
            if((n & 1) == 0) return true;
            else return false;
        }
    }
}
