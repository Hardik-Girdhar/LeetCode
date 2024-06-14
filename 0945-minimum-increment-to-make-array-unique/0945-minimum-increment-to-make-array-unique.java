// class Solution {
//     public int minIncrementForUnique(int[] nums) {
//         Arrays.sort(nums);
//         int count = 0;
//         for(int i=1;i<nums.length;i++){
//             if(nums[i-1] >= nums[i]){
//                 count += nums[i-1] - nums[i] + 1;
//                 nums[i] = nums[i-1]+1;
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] >= nums[i]){
                ans += nums[i-1]-nums[i]+1;
                nums[i] = nums[i-1] + 1;
            }
        }
        return ans;
    }
}