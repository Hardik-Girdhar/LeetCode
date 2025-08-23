class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int sRow = 0;
        int eRow = matrix.length-1;
        int sCol = 0;
        int eCol = matrix[0].length-1;

        while(sRow <= eRow && sCol <= eCol){
            // top
            for(int j=sCol; j<=eCol; j++){
                list.add(matrix[sRow][j]);
            }

            // right
            for(int i=sRow+1; i<=eRow; i++){
                list.add(matrix[i][eCol]);
            }

            // bottom
            for(int j=eCol-1; j>=sCol; j--){
                if(sRow == eRow) break;           // single row -- has already covered above
                list.add(matrix[eRow][j]);
            }

            // left
            for(int i=eRow-1; i>sRow; i--){
                if(sCol == eCol) break;         // single column -- has already covered above
                list.add(matrix[i][sCol]);
            }

            sRow++;
            eRow--;
            sCol++;
            eCol--;
        }

        return list;
    }
}