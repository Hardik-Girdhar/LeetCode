// class Solution {
//     public List<Integer> luckyNumbers (int[][] matrix) {
//         int rows = matrix.length;
//         int cols = matrix[0].length;

//         int[] row_minimums = new int[rows];
//         Arrays.fill(row_minimums, Integer.MAX_VALUE);
//         int[] col_maximums = new int[cols];

//         for (int row_ind = 0; row_ind < rows; ++row_ind) {
//             for (int col_ind = 0; col_ind < cols; ++col_ind) {
//                 int el = matrix[row_ind][col_ind];
//                 row_minimums[row_ind] = Math.min(row_minimums[row_ind], el);
//                 col_maximums[col_ind] = Math.max(col_maximums[col_ind], el);
//             }
//         }

//         for (int row_ind = 0; row_ind < rows; ++row_ind) {
//             for (int col_ind = 0; col_ind < cols; ++col_ind) {
//                 int el = matrix[row_ind][col_ind];
//                 if (el == row_minimums[row_ind] && el == col_maximums[col_ind]) {
//                     return Collections.singletonList(el);
//                 }
//             }
//         }

//         return Collections.emptyList();
//     }
// }

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> minRow = new ArrayList<>();
        List<Integer> maxCol = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0; i<row; i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j<col; j++){
                min = Math.min(min, matrix[i][j]);
            }
            minRow.add(min);
        }

        for(int i=0;i<col;i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0;j<row;j++){
                max = Math.max(max,matrix[j][i]);
            }
            maxCol.add(max);
        }
        
        List<Integer> ans = new ArrayList<>(minRow);
        ans.retainAll(maxCol);        

        return ans;
    }
}