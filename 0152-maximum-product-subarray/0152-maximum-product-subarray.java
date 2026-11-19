class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int prod = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        for(int i=0; i<n; i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix *= nums[i];
            suffix *= nums[n-i-1];

            prod = Math.max(prod, Math.max(prefix, suffix));
        }

        return prod;
    }
}