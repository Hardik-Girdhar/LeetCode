// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         double ans = 0;
//         int i=0;
//         int j=0;
//         double sum = 0;
//         double res=Double.NEGATIVE_INFINITY;
//         while(j<nums.length){
//             sum = sum + nums[j];
//             if(j-i+1 < k){
//                 j++;
//             }
//             else if(j-i+1 == k){
//                 ans = sum/k;
//                 res = Math.max(res,ans);
//                 sum = sum - nums[i];
//                 i++;
//                 j++;
//             }
//         }
//         return res;
//     }
// }

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        double ans = 0;
        double sum=0;
        double res = Double.NEGATIVE_INFINITY;
        while(j<nums.length){
            sum = sum + nums[j];
            if((j-i+1) < k){
                j++;
            }
            else  if(j-i+1 == k){
                ans = sum/k;
                res = Math.max(ans,res);
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        return res;
    }
}