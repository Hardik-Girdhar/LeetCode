// class Solution {
//     public int minDays(int[] bloomDay, int m, int k) {
//         int ans=-1;
//         int s=0;
//         int e=max(bloomDay);
//         while(s<=e){
//             int mid = s+(e-s)/2;
//             if(isPossible(bloomDay,mid,m,k)){
//                 ans = mid;
//                 e = mid-1;
//             }
//             else{
//                 s = mid+1;
//             }
//         }
//         return ans;
//     }
//     public int max(int[] arr){
//         int max=0;
//         for(int i:arr){
//             max = Math.max(max,i);
//         }
//         return max;
//     }
//     public boolean isPossible(int[] arr,int mid,int m,int k){
//         int bouq = 0;
//         int cons_flw = 0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<=mid){
//                 cons_flw++;
//             }
//             else{
//                 cons_flw=0;
//             }
            
//             if(cons_flw == k){
//                 bouq++;
//                 cons_flw=0;
//             }
//         }
//         return bouq>=m;
//     }
// }


class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int ans = -1;
        int l = 0;
        int r = max(bloomDay);
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isPossible(bloomDay , mid , m , k)){
                ans = mid;
                r = mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public int max(int[] nums){
        int max = 0;
        for(int ele : nums){
            max = Math.max(max , ele);
        }
        return max;
    }
    public boolean isPossible(int[] nums, int mid, int m , int k){
        int bouq = 0;
        int cons_flw = 0;
        for(int i =0; i<nums.length;i++){
            if(nums[i] <= mid){
                cons_flw++;
            }
            else{
                cons_flw=0;
            }
            
            if(cons_flw==k){
                bouq++;
                cons_flw=0;
            }
        }
        return bouq>=m;
    }
}