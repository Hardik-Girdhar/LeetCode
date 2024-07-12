// class Solution {
//     public int numberOfSubmatrices(char[][] grid) {
//         int ans=0;
//         int[] countX = new int[grid[0].length];
//         int[] countY = new int[grid[0].length];
//         for(int i=0; i<grid.length; i++){
//             int x=0;
//             int y=0;
//             for(int j=0;j<grid[i].length;j++){
//                 if(grid[i][j] == 'X') x++;
//                 if(grid[i][j] == 'Y') y++;
//                 countX[j] += x;
//                 countY[j] += y;
//                 if(countX[j] >= 1 && countY[j] == countX[j]) ans++;
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int ans = 0;
        int countX[] = new int[grid[0].length];
        int countY[] = new int[grid[0].length];
        for(int i=0;i<grid.length;i++){
            int x = 0;
            int y = 0;
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == 'X') x++;
                if(grid[i][j] == 'Y') y++;

                countX[j] += x;
                countY[j] += y;

                if(countX[j] >= 1 && countX[j] == countY[j]) ans++;
            }
        }
        return ans;
    }
}