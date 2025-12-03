class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return helper(n, memo);
    }

    private int helper(int n, int[] memo) {
        if (n <= 1) return 1;

        if (memo[n] != 0) return memo[n];

        memo[n] = helper(n - 1, memo) + helper(n - 2, memo);
        return memo[n];
    }
}




// class Solution {
//     public int climbStairs(int n) {
//         if(n == 1 || n == 2){
//             return n;
//         }
//         return climbStairs(n-1) + climbStairs(n-2);
//     }
// }