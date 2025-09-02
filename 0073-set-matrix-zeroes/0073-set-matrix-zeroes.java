class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int row[] = new int[m];
        int col[] = new int[n];

        // inc counter of row and col at particular index if finds 0
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    row[i]++;
                    col[j]++;
                }
            }
        }

        // as per counter array if at any index have more than 0 value convert into 0
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(row[i]>0 || col[j]>0){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int m=matrix.length;
//         int n=matrix[0].length;

//         // find 0 and mark rows and col to -1
//         for(int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 if(matrix[i][j] == 0){
//                     markRow(matrix, m, n, i);
//                     markCol(matrix, m, n, j);
//                 }
//             }
//         }

//         // mark -1 values to 0
//         for(int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 if(matrix[i][j] == -1){
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }
 
//     // marking row as -1
//     public void markRow(int[][] matrix, int m, int n, int i){
//         for(int j=0; j<n; j++){
//             if(matrix[i][j] != 0){
//                 matrix[i][j] = -1;
//             }
//         }
//     }

//     // marking col as -1
//     public void markCol(int[][] matrix, int m, int n, int j){
//         for(int i=0; i<m; i++){
//             if(matrix[i][j] != 0){
//                 matrix[i][j] = -1;
//             }
//         }
//     }
// }