// class Solution {
//     public int numberOfSubarrays(int[] nums, int k) {
//         int ans=0;
//         int count=0;
//         int prev=0;
//         int i=0;
//         int j=0;
//         while(j<nums.length){
//             if(nums[j]%2 != 0 ){
//                 count++;
//                 prev=0;
//             }
//             while(count == k){
//                 prev ++;
//                 if(nums[i] % 2 == 1){
//                     count--;
//                 }
//                 i++;
//             }
//             ans += prev;
//             j++;
//         }
//         return ans;
//     }
// }

// class Solution {
//     public int numberOfSubarrays(int[] nums, int k) {
//         int res = 0;
//         int curr = 0;
//         HashMap<Integer,Integer> map = new HashMap<>();
//         map.put(0,1);
//         for(int i:nums){
//             curr += i%2;      // odd - 1 , even - 0, tells no of odd
//             res += map.getOrDefault(curr-k,0);
//             map.put(curr,map.getOrDefault(curr,0)+1);
//         }
//         return res;
//     }
// }

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans =0;
        int count=0;
        int prev=0;
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j] % 2 != 0){
                count++;
                prev = 0;
            }
            while(count == k){
                prev++;
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