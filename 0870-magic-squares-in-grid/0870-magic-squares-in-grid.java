class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int rowInd = row - 2;  // see where the index can go to make matrix of 3 ,
        int colInd = col - 2;  // 4 rows then, index can be 0,1 -- 4-3 = upto 1

        int count=0;
        for(int i=0; i<rowInd; i++){
            for(int j=0; j<colInd; j++){
                if(isMagicMatrix(grid,i,j)){
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isMagicMatrix(int[][] grid, int r, int c){
        // uniqueness 1 to 9 distinct
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int num = grid[i+r][j+c];
                if(num<1 || num>9 || set.contains(num)){
                    return false;
                }
                else{
                    set.add(num);
                }
            }
        }

        // check the sum of row col and both diag
        int SUM = grid[r][c] + grid[r][c+1] + grid[r][c+2];
        for(int i=0;i<3;i++){
            // row
            if(grid[r+i][c] + grid[r+i][c+1] + grid[r+i][c+2] != SUM){
                return false;
            }
            // col
            if(grid[r][c+i] + grid[r+1][c+i] + grid[r+2][c+i] != SUM){
                return false;
            }
        }

        // diag
        if(grid[r][c] + grid[r+1][c+1] + grid[r+2][c+2] != SUM){
            return false;
        }
        if(grid[r][c+2] + grid[r+1][c+1] + grid[r+2][c] != SUM){
            return false;
        }

        return true;
    }
}

// class Solution {
    
//     private boolean isMagicGrid(int[][] grid, int r, int c) {
//         // Uniqueness check for numbers 1 to 9
//         Set<Integer> st = new HashSet<>();
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 int num = grid[r + i][c + j];
//                 if (num < 1 || num > 9 || st.contains(num)) {
//                     return false;
//                 } else {
//                     st.add(num);
//                 }
//             }
//         }

//         // Check the sum for rows and columns
//         int SUM = grid[r][c] + grid[r][c + 1] + grid[r][c + 2];
//         for (int i = 0; i < 3; i++) {
//             if (grid[r + i][c] + grid[r + i][c + 1] + grid[r + i][c + 2] != SUM) {
//                 return false;
//             }
//             if (grid[r][c + i] + grid[r + 1][c + i] + grid[r + 2][c + i] != SUM) {
//                 return false;
//             }
//         }

//         // Check the diagonal and anti-diagonal
//         if (grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2] != SUM) {
//             return false;
//         }
//         if (grid[r][c + 2] + grid[r + 1][c + 1] + grid[r + 2][c] != SUM) {
//             return false;
//         }

//         return true;
//     }

//     public int numMagicSquaresInside(int[][] grid) {
//         int rows = grid.length;
//         int cols = grid[0].length;

//         int count = 0;

//         for (int i = 0; i <= rows - 3; i++) {
//             for (int j = 0; j <= cols - 3; j++) {
//                 if (isMagicGrid(grid, i, j)) {
//                     count++;
//                 }
//             }
//         }

//         return count;
//     }
// }
