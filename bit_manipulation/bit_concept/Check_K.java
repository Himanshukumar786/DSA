package bit_manipulation.bit_concept;

public class Check_K-th_Bit {
    class CheckBit {
        static boolean checkKthBit(int n, int k) {
            // code here
            return (n & (1 << (k))) != 0;
        }
    }
}
