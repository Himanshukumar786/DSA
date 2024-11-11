package bit_manipulation;

public class single_number {
    class Solution {
        public int singleNumber(int[] nums) {

            // using the XOR (bitwise XOR)
            // ex => 1^1 = 0 , 1 ^ 2 = 1
            
            int value = 0;
            
            for(int i = 0; i < nums.length; i++){
                value = value ^ nums[i];
            }
            return value;
        }
    }
}
