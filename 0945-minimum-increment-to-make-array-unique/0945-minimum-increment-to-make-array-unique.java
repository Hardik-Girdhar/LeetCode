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
        int count=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>=nums[i]){
                count += nums[i-1]-nums[i]+1;
                nums[i] = nums[i-1]+1;
            }
        }
        return count;
    }
}