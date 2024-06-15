class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=0;
        int s=0;
        int e=nums.length-1;
        while(s<e){
            if(nums[s]+nums[e] == k){
                ans++;
                s++;
                e--;
            }
            else if(nums[s]+nums[e] > k){
                e--;
            }
            else if(nums[s]+nums[e] < k){
                s++;
            }
        }
        return ans;
    }
}