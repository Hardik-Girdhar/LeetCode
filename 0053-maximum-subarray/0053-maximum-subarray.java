class Solution {
    public int maxSubArray(int[] nums) {
        
        // Brute force - O(n)
        int currSum = nums[0];
        int max = nums[0];
        for(int i=1 ; i<nums.length ; i++)
        {
            if(currSum < 0)
            {
                currSum = 0;
            }
            currSum = currSum + nums[i];
            max = Math.max(currSum , max);
        }
        return max;

        /*  // BRUTE FORCE O(n^2)
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length ; i++)
        {
            int sum = 0;
            for(int j = i ; j<nums.length ; j++)
            {
                sum = sum+nums[j];
                max = Math.max(sum,max);
            }
        }
        return max;
        */

        /*  // BRUTE FORCE  - O(n^3) 
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length ; i++)
        {
            for(int j = i ; j<nums.length ; j++)
            {
                int sum = 0;
                for(int k = i ; k<=j ; k++)
                {
                    sum = sum+nums[k];
                }
                max = Math.max(sum,max);
            }
        }
        return max;
        */
    }
}