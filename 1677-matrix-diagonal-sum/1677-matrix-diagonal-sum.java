class Solution {
    public int diagonalSum(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int sum = 0;

        for(int i=0; i<row; i++){
            for(int j =0;j<col;j++){
                if(i==j){
                    sum += matrix[i][j];
                }
                else if(i+j == row-1){
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }
}