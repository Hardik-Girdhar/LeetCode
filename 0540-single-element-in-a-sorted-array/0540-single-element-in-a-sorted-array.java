class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        for(int i=0; i<n; i++){
            if(i == 0){
                if(nums[i] != nums[i+1]) return nums[0];
            }
            else if(i == n-1){
                if(nums[i] != nums[i-1]) return nums[n-1];
            }   
            else{
                if(nums[i] != nums[i-1] && nums[i] != nums[i+1]) return nums[i];
            }
        }

        return -1;
    }
}