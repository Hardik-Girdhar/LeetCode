// //BRUTE FORCE
// class Solution {
//     public int diagonalSum(int[][] matrix) {
//         int row = matrix.length;
//         int col = matrix[0].length;
//         int sum = 0;

//         for(int i=0; i<row; i++){
//             for(int j =0;j<col;j++){
//                 if(i==j){
//                     sum += matrix[i][j];
//                 }
//                 else if(i+j == row-1){
//                     sum += matrix[i][j];
//                 }
//             }
//         }
//         return sum;
//     }
// }

class Solution {
    public int diagonalSum(int[][] matrix) {
        int row = matrix.length;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += matrix[i][i];
            if (i != row - i - 1) {
                sum += matrix[i][row - i - 1];
            }
        }
        return sum;
    }
}