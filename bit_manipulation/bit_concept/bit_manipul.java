package bit_manipulation.bit_concept;

public class bit_manipul {
    class Solution {
        static void bitManipulation(int num, int i) {
            // code here
            int getbit = (num >> (i - 1)) & 1;
            int setbit = num | (1 << (i - 1));
            int clearbit = num & ~(1 << (i - 1));
            System.out.print(getbit + " " + setbit + " " + clearbit);
        }
    }
}
