// row wise binary search check target between 1st element of row and last
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m; i++){
            if(matrix[i][0] <= target && matrix[i][n-1] >= target){
                return binarySearch(matrix[i], target);
            }
        }
        return false;
    }
    public static boolean binarySearch(int[] matrix, int target){
        int s = 0;
        int e = matrix.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(matrix[mid] == target){
                return true;
            }
            else if(matrix[mid] < target){
                s = mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;
    }
}


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