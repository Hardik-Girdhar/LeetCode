// Flattering 2d into 1d then binary search by getting formula for i,j from mid = O(logmn)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int s = 0;
        int e = m*n-1;

        while(s<=e){
            int mid = s + (e-s)/2;
            int row = mid/n;
            int col = mid%n;

            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return false;
    }
}


// // Stair Case Method -> O(m+n) -> O(n) ---> row and col wise sort 
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int m = matrix.length;
//         int n = matrix[0].length;

//         int row = 0;
//         int col = n-1;

//         while(row < m && col >= 0){
//             if(matrix[row][col] == target){    // started from 1st row last ele
//                 return true;                   // down -> greater, left -> smaller
//             } 
//             else if (matrix[row][col] > target){
//                 col--;                         // left -> towards smaller
//             }
//             else{
//                 row++;                         // down -> towards greater
//             }
//         }
//         return false;
//     }
// }


// //row wise binary search check target between 1st element of row and last -- O(n + logn) = n
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int m = matrix.length;
//         int n = matrix[0].length;
//         for(int i=0; i<m; i++){
//             if(matrix[i][0] <= target && matrix[i][n-1] >= target){
//                 return binarySearch(matrix[i], target);
//             }
//         }
//         return false;
//     }
//     public static boolean binarySearch(int[] matrix, int target){
//         int s = 0;
//         int e = matrix.length-1;
//         while(s<=e){
//             int mid = s+(e-s)/2;
//             if(matrix[mid] == target){
//                 return true;
//             }
//             else if(matrix[mid] < target){
//                 s = mid+1;
//             }
//             else{
//                 e=mid-1;
//             }
//         }
//         return false;
//     }
// }


// // brute force --> O(n2)
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int m = matrix.length;
//         int n = matrix[0].length;
//         for(int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 if(matrix[i][j] == target) return true;
//             }
//         }
//         return false;
//     }
// }