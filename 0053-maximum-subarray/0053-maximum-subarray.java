class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int num : nums){
            if(currSum < 0) currSum = 0;

            currSum += num;
            sum = Math.max(sum, currSum);
        }

        return sum;
    }
}