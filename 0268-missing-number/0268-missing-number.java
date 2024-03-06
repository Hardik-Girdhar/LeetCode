class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int sum = (n*(n+1))/2;
        // int sum2 = 0;
        // for(int i=0;i<nums.length ; i++)
        // {
        //     sum2 = sum2+nums[i];
        // }
        // return sum - sum2;
        
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0 ; i<=nums.length ; i++)
        {
            xor1 = xor1^i;
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            xor2 = xor2 ^ nums[i];
        }
        return xor1 ^ xor2;
    }
}