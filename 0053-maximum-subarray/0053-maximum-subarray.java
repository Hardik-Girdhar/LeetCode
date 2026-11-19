// BEST OPTIMAL KADANE'S ALGO - O(n)
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0; i<nums.length; i++){
            if(currsum < 0){
                currsum = 0;
            }
            currsum += nums[i];
            sum = Math.max(currsum,sum);
        }
        return sum;
    }
}

// // BETTER APPROACH - O(n^2)
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int sum = Integer.MIN_VALUE;    
//         for(int i=0;i<nums.length;i++){
//             int currsum = 0;
//             for(int j=i; j<nums.length;j++){
//                 currsum = currsum + nums[j];
//                 sum = Math.max(sum,currsum);
//             }
//         }
//         return sum;
//     }
// }



// // BRUTE FORCE - O(n^3)
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int sum = Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i; j<nums.length;j++){
//                 int currsum = 0;
//                 for(int k=i;k<=j;k++){
//                     currsum+=nums[k]; 
//                 }
//                 sum = Math.max(sum,currsum);
//             }
//         }
//         return sum;
//     }
// }