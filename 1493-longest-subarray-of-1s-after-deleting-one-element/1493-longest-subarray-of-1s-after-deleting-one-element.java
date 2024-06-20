// 1004. Max Consecutive Ones III  ---------- just k=1 remain same

class Solution {
    public int longestSubarray(int[] nums) {
        int k=1;
        int ans=0;
        int zeros=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] == 0){
                zeros++;
            }
            while(zeros > k){
                if(nums[i]==0){
                    zeros--;
                }
                i++;
            }
            ans = Math.max(ans,j-i+1);
        }
        return ans-1;
    }
}