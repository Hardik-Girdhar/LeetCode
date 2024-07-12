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
    // public boolean isValid(char[][] grid, int strow, int stcol, int endrow, int endcol){
    //     int cntX=0;
    //     int cntY=0;
    //     boolean containsX=false;
    //     for(int i=strow; i<=endrow;i++){
    //         for(int j=stcol;j<=endcol;j++){
    //             if(grid[i][j]=='X'){
    //                 cntX++;
    //                 containsX=true;
    //             }else if(grid[i][j]=='Y'){
    //                 cntY++;
    //             }
    //         }
    //     }
    //     return containsX && cntX==cntY;
    // }
    
    
    public int numberOfSubmatrices(char[][] grid) {
        // Brute force - throws tle
        // int cnt=0;
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[0].length;j++){
        //         if(isValid(grid,0,0,i,j)) cnt++;
        //     }
        // }
        // return cnt;

        // Optimal - tc: O(mn) sc: O(nm)
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        int[][] x=new int[n+1][m+1];
        int[][] y=new int[n+1][m+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                x[i+1][j+1]=x[i+1][j]+x[i][j+1]-x[i][j] + (grid[i][j]=='X' ? 1:0);
                y[i+1][j+1]=y[i+1][j]+y[i][j+1]-y[i][j] + (grid[i][j]=='Y' ? 1:0);

                if(x[i+1][j+1]==y[i+1][j+1] && x[i+1][j+1]>0) cnt++;
            }

        }
        return cnt;
    }
}