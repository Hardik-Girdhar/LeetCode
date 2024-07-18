class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int row = matrix.length;
        int col = matrix[0].length;

        int startRow = 0;
        int endRow = row - 1;
        int startCol = 0;
        int endCol = col - 1;

        int key = 1;
        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                matrix[startRow][j] = key;
                key++;
            }
            startRow++;

            // right
            for (int i = startRow; i <= endRow; i++) {
                matrix[i][endCol] = key;
                key++;
            }
            endCol--;

            // bottom
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    matrix[endRow][j] = key;
                    key++;
                }
            }
            endRow--;

            // left
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    matrix[i][startCol] = key;
                    key++;
                }
            }
            startCol++;
        }

        return matrix;
    }
}