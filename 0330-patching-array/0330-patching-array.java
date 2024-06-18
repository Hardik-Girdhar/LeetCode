// class Solution {
//     public int minPatches(int[] nums, int n) {
//         int patch=0;
//         long max_reach=0;
//         int i=0;
//         while(max_reach < n){
//             if(i<nums.length && nums[i] <= max_reach+1){
//                 max_reach += nums[i];
//                 i++;
//             }
//             else{
//                 max_reach += (max_reach+1);
//                 patch++;
//             }
//         }
//         return patch;
//     }
// }

class Solution {
    public int minPatches(int[] nums, int n) {
        int patch = 0;
        int i=0;
        long max_reach = 0;
        while(max_reach < n){
            if(i<nums.length && nums[i] <= max_reach+1){
                max_reach += nums[i];
                i++;
            }
            else{
                max_reach += max_reach+1;
                patch++;
            }
        }
        return patch;
    }
}