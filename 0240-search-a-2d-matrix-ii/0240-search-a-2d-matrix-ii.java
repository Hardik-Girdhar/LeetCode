class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n-1;

        while(row < m && col >= 0){
            if(matrix[row][col] == target){         // strating from 1st row last element
                return true;                        //  easy to go left or down
            }
            else if(matrix[row][col] > target){     // go left -> toward smaller
                col--;
            }
            else{                                   // go down -> towards greater
                row++;
            }
        }

        return false;
    }
}