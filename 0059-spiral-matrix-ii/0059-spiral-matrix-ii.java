class Solution {
    public int[][] generateMatrix(int n) {
        int key = 1;
        int[][] matrix = new int[n][n];
        int sRow = 0;
        int eRow = n-1;
        int sCol = 0;
        int eCol = n-1;

        while(sRow <= eRow && sCol <= eCol){
            // top
            for(int j=sCol; j<=eCol; j++){
                matrix[sRow][j] = key;
                key++;
            }
            // right
            for(int i=sRow+1; i<=eRow; i++){
                matrix[i][eCol] = key;
                key++;
            }
            // bottom
            for(int j=eCol-1; j>=sCol; j--){
                if(sRow == eRow) break;
                matrix[eRow][j] = key;
                key++;
            }
            // left
            for(int i=eRow-1; i>sRow; i--){
                if(sCol == eCol) break;
                matrix[i][sCol] = key;
                key++;
            }

            sRow++;
            eRow--;
            sCol++;
            eCol--;
        }
        
        return matrix;
    }
}