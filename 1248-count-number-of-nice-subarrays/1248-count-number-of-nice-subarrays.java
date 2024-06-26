// class Solution {
//     public int numberOfSubarrays(int[] nums, int k) {
//         int n = nums.length;
//         int[] cnt = new int[n + 1];
//         cnt[0] = 1;
//         int ans = 0, t = 0;
//         for (int v : nums) {
//             t += v & 1;
//             if (t - k >= 0) {
//                 ans += cnt[t - k];
//             }
//             cnt[t]++;
//         }
//         return ans;
//     }
// }

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans=0;
        int count=0;
        int prev=0;
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]%2 != 0 ){
                count++;
                prev=0;
            }
            while(count == k){
                prev ++;
                if(nums[i] % 2 == 1){
                    count--;
                }
                i++;
            }
            ans += prev;
            j++;
        }
        return ans;
    }
}