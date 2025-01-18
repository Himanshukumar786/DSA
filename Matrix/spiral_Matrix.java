package Matrix;

import java.util.ArrayList;
import java.util.List;

public class spiral_Matrix {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> ans = new ArrayList<>();

            if(matrix.length == 0){
                return ans;
            }
            int r = matrix.length;
            int c = matrix[0].length;
            int top = 0, down = r - 1;
            int left = 0, right = c - 1;

            int direction = 0;

            // directions ->  left  to  right
            //                top   to  down
            //                right to  left
            //                down  to  top

            while(top <= down && left <= right){
                // left to right
                if(direction == 0){
                    for(int i = left; i <= right; i++){
                        ans.add(matrix[top][i]);
                    }
                    top++;
                }

                // top to down
                if(direction == 1){
                    for(int i = top; i <= down; i++){
                        ans.add(matrix[i][right]);
                    }
                    right--;
                }

                // right to left
                if(direction == 2){
                    for(int i = right; i >= left; i--){
                        ans.add(matrix[down][i]);
                    }
                    down--;
                }

                // down to top
                if(direction == 3){
                    for(int i = down; i >= top; i--){
                        ans.add(matrix[i][left]);
                    }
                    left++;
                }

                direction++;
                if(direction > 3){
                    direction = 0;
                }
            }
            return ans;
        }
    }
}
