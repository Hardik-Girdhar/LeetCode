// class Solution {
//     public int minDays(int[] bloomDay, int m, int k) {
//         int s = 1;
//         int e = maxofArray(bloomDay);
//         int ans = -1;
//         while (s <= e) {
//             int mid = s + (e - s) / 2;
//             if (isPossible(bloomDay, mid, m, k)) {
//                 ans = mid;
//                 e = mid - 1;
//             }
//             else{
//                 s =mid + 1;
//             }
//         }
//         return ans;
//     }

//     public boolean isPossible(int[] bloomDay, int mid, int nob, int nof) {
//         int m = 0;
//         int k = 0;
//         for (int ele : bloomDay) {
//             if (ele <= mid) {
//                 k++;
//                 if (k == nof) {
//                     m++;
//                     k = 0;
//                 }
//             } else {
//                 k = 0;
//             }
//         }
//         return m >= nob;
//     }

//     public int maxofArray(int[] arr) {
//         int max = arr[0];
//         for (int i : arr) {
//             if (max < i) {
//                 max = i;
//             }
//         }
//         return max;
//     }
// }

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int ans=-1;
        int s=0;
        int e=max(bloomDay);
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isPossible(bloomDay,mid,m,k)){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
    public int max(int[] arr){
        int max=0;
        for(int i:arr){
            max = Math.max(max,i);
        }
        return max;
    }
    public boolean isPossible(int[] arr,int mid,int m,int k){
        int bouq = 0;
        int cons_flw = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                cons_flw++;
            }
            else{
                cons_flw=0;
            }
            
            if(cons_flw == k){
                bouq++;
                cons_flw=0;
            }
        }
        return bouq>=m;
    }
}