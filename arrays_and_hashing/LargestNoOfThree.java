import java.util.Arrays;

class Solution {
    public String largestMultipleOfThree(int[] digits) {
        int n = digits.length;
        int sum = 0;
        
        for (int i = 0; i < n; i++) sum += digits[i];
        
        Arrays.sort(digits);
        if (sum % 3 == 0) {

            if (digits[n - 1] == 0) return "0";
            
            StringBuilder str = new StringBuilder();
            for (int i = n - 1; i >= 0; i--) {
                str.append(digits[i]);
            }
            return str.toString();
        } else if (sum % 3 == 1) {
            boolean idealFound = false;
            for (int i = 0; i < n; i++) {
                if (digits[i] % 3 == 1) {
                    idealFound = true;
                    digits[i] = -1;
                    break;
                }
            }
            if (!idealFound) {
                int[] idx = new int[2];
                idx[0] = -1;
                idx[1] = -1;

                for (int i = 0; i < n; i++) {
                    if (digits[i] % 3 == 2) {
                        if (idx[0] == -1) idx[0] = i;
                        else {
                            idx[1] = i;
                            break;
                        }
                    }
                }
                if (idx[1] != -1) {
                    digits[idx[0]] = -1;
                    digits[idx[1]] = -1;
                } else return "";
            }
        } else {
            boolean idealFound = false;
            for (int i = 0; i < n; i++) {
                if (digits[i] % 3 == 2) {
                    idealFound = true;
                    digits[i] = -1;
                    break;
                }
            }
            if (!idealFound) {
                int[] idx = new int[2];
                idx[0] = -1;
                idx[1] = -1;

                for (int i = 0; i < n; i++) {
                    if (digits[i] % 3 == 1) {
                        if (idx[0] == -1) idx[0] = i;
                        else {
                            idx[1] = i;
                            break;
                        }
                    }
                }
                if (idx[1] != -1) {
                    digits[idx[0]] = -1;
                    digits[idx[1]] = -1;
                } else return "";
            }
        }
        
        StringBuilder ans = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != -1) ans.append(digits[i]);
        }
        if (ans.length() == 0) return "";

        if (ans.charAt(0) == '0') return "0";
        
        return ans.toString();
    }
}