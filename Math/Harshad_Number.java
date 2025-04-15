// Removed package declaration to match the expected package structure

public class Harshad_Number {
    class Solution {
        public int sumOfTheDigitsOfHarshadNumber(int x) {
            int sum = 0;
            int number = x;
    
            while(x > 0){
                sum += x % 10;
                x /= 10;
            }
            
            return number % sum == 0 ? sum : -1;
        }
    }
}
