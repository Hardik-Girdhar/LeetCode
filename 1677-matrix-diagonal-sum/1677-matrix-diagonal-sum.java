// optimized
class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int primarySum = 0;
        int secondarySum = 0;
        for(int i=0;i<n;i++){
            primarySum += mat[i][i];
            if(i != n-1-i){
                secondarySum += mat[i][n-1-i];
            }
        }
        return primarySum + secondarySum;
    }
}

// // Brute force
// class Solution {
//     public int diagonalSum(int[][] mat) {
//         int n = mat.length;
//         int primarySum=0;
//         int secondarySum=0;
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 if(i == j){
//                     primarySum += mat[i][j];
//                 }
//                 else if(i+j == n-1){
//                     secondarySum += mat[i][j];
//                 }
//             }
//         }
//         return primarySum + secondarySum;
//     }
// }