// class Solution {
//     public boolean increasingTriplet(int[] nums) {
//         int left=Integer.MAX_VALUE;
//         int mid = Integer.MAX_VALUE;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]<=left){
//                 left = nums[i];
//             }
//             else if(nums[i]<=mid){
//                 mid = nums[i];
//             }
//             else{
//                 return true;
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int left = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=left){
                left = nums[i];
            }
            else if(nums[i]<=mid){
                mid = nums[i];
            }
            else{
                return true;
            }
        }
        return false;
    }
}

// class Solution {
//     public boolean increasingTriplet(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 for(int k=j+1;k<nums.length;k++){
//                     if(nums[i]<nums[j] && nums[j]<nums[k]){
//                         return true;
//                     }
//                 }
//             }
//         }
//         return false;
//     }
// }