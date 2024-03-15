class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int row = matrix.length;
        if(row == 0) return list; // Empty matrix case
        int col = matrix[0].length;
        
        int rowbegin = 0;
        int rowend = row - 1;
        int colbegin = 0;
        int colend = col - 1;
        
        while (rowbegin <= rowend && colbegin <= colend) {
            // TRAVERSE RIGHT
            for (int i = colbegin; i <= colend; i++) {
                list.add(matrix[rowbegin][i]);
            }
            rowbegin++;
            // TRAVERSE DOWN
            for (int i = rowbegin; i <= rowend; i++) {
                list.add(matrix[i][colend]);
            }
            colend--;
            // TRAVERSE LEFT
            if (rowbegin <= rowend) { // Check if there are rows left
                for (int i = colend; i >= colbegin; i--) {
                    list.add(matrix[rowend][i]);
                }
            }
            rowend--;
            // TRAVERSE UP
            if (colbegin <= colend) { // Check if there are columns left
                for (int i = rowend; i >= rowbegin; i--) {
                    list.add(matrix[i][colbegin]);
                }
            }
            colbegin++;
        }
        return list;
    }
}