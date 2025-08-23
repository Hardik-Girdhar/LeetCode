// Brute force
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int primarySum=0;
        int secondarySum=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j){
                    primarySum += mat[i][j];
                }
                else if(i+j == n-1){
                    secondarySum += mat[i][j];
                }
            }
        }
        return primarySum + secondarySum;
    }
}