// class Solution {
//     public int minPatches(int[] nums, int n) {
//         long miss = 1;
//         int result = 0;
//         int i = 0;

//         while (miss <= n) {
//             if (i < nums.length && nums[i] <= miss) {
//                 miss += nums[i];
//                 i++;
//             } else {
//                 miss += miss;
//                 result++;
//             }
//         }

//         return result;
//     }
// }

class Solution {
    public int minPatches(int[] nums, int n) {
        int patch=0;
        long max_reach=0;
        int i=0;
        while(max_reach < n){
            if(i<nums.length && nums[i] <= max_reach+1){
                max_reach += nums[i];
                i++;
            }
            else{
                max_reach += (max_reach+1);
                patch++;
            }
        }
        return patch;
    }
}