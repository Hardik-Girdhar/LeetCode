class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // 1 -> transpose -> half matrix
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){      // half matrix, otherwise same output 
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // 2 -> reverse -> each col reverse to get final output
        for(int i=0; i<n; i++){
            int s = 0;
            int e = n-1;
            while(s<e){
                int temp = matrix[i][s];
                matrix[i][s] = matrix[i][e];
                matrix[i][e] = temp;
                s++;
                e--;
            }
        }
    }
}


// // brute force
// class Solution {
//     public void rotate(int[][] matrix) {
//         int n = matrix.length;
//         int[][] rotate = new int[n][n];

//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 rotate[j][n-i-1] = matrix[i][j];
//             }
//         }

//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 matrix[i][j] = rotate[i][j];
//             }
//         }
//     }
// }