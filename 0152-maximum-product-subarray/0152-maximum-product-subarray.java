class Solution {
    public int maxProduct(int[] nums) {
        int maxii = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix *= nums[i];
            suffix *= nums[n-i-1];

            maxii = Math.max(maxii, Math.max(prefix, suffix));
        }

        return maxii;
    }
}