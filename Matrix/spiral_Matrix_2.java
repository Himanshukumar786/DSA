package Matrix;

public class spiral_Matrix_2 {
    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] matrix = new int[n][n];
    
            int top  = 0,  down  = n - 1;
            int left = 0,  right = n - 1;
    
            int direction = 0;
    
            // directions ->  left  to  right
            //                top   to  down
            //                right to  left
            //                down  to  top
            
            int counter = 1;
            while(top <= down && left <= right){
                
                // left to right
                if(direction == 0){
                    for(int i = left; i <= right; i++){
                        matrix[top][i] = counter++;
                    }
                    top++;
                }
    
                // top to down
                if(direction == 1){
                    for(int i = top; i <= down; i++){
                        matrix[i][right] = counter++;
                    }
                    right--;
                }
    
                // right to left
                if(direction == 2){
                    for(int i = right; i >= left; i--){
                        matrix[down][i] = counter++;
                    }
                    down--;
                }
    
                // down to top
                if(direction == 3){
                    for(int i = down; i >= top; i--){
                        matrix[i][left] = counter++;
                    }
                    left++;
                }
    
                direction++;
                if(direction > 3){
                    direction = 0;
                }
            }
            return matrix;
        }
    }
}
