// // O(n), O(1)
// class Solution {
//     public boolean search(int[] nums, int target) {
//         for(int i=0; i<nums.length; i++){
//             if(nums[i] == target) return true;
//         }

//         return false;
//     }
// }


// O(logn), O(1)
class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target) return true;
            else if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low = low + 1;
                high = high - 1;
            }
            else if(nums[low] <= nums[mid]){
                if(nums[low] <= target && nums[mid] >= target){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(nums[mid] <= target && nums[high] >= target){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        
        return false;
    }
}