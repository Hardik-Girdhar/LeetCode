// class Solution {
//     public void rotate(int[][] matrix) {
//         int n=matrix.length;
//         int rotate[][] = new int[n][n];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 rotate[j][n-i-1] = matrix[i][j];
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 matrix[i][j] = rotate[i][j];
//             }
//         }
//     }
// }

class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
//  TRANSPOSE        
        for(int i=0;i<row ; i++){
            for(int j=i;j<col;j++){
                int temp= matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
//  REVERSE
        for(int i=0;i<row ; i++){
            int lp=0;
            int rp=col-1;
            while(lp<rp){
                int temp = matrix[i][lp];
                matrix[i][lp] = matrix[i][rp];
                matrix[i][rp] = temp;
                lp++;
                rp--;
            }
        }
    }
}