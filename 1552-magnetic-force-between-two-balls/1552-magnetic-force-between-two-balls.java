// class Solution {
//     public int maxDistance(int[] position, int m) {
//         Arrays.sort(position);
//         int lo = 1;
//         int hi = (position[position.length-1]-position[0])/(m-1);
//         int ans = 1;
//         while(lo<=hi)
//         {
//             int mid = lo+(hi-lo)/2;
//             if(canWePlace(position, mid, m))
//             {
//                 ans = mid;
//                 lo=mid+1;
//             }
//             else
//             {
//                 hi = mid-1;
//             }
//         }
//         return ans;
//     }
//     private boolean canWePlace(int[] arr, int dist, int cows)
//     {
//         int cntCows=1;
//         int last = arr[0];
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]-last>=dist)
//             {
//                 cntCows++;
//                 last = arr[i];
//             }
//             if(cntCows>=cows)
//             {
//                 return true;
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int ans = 0;
        int min = 1;
        int max = position[position.length-1] - position[0];
        while(min <= max){
            int mid = min + (max-min)/2;
            if(isPossible(position, mid, m)){
                ans = mid;
                min = mid+1;
            }
            else{
                max = mid-1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] arr, int force , int m){
        int prev = arr[0];
        int countBall = 1;
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            if(curr - prev >= force){
                countBall++;
                prev = curr;
            }
            if(countBall == m){
                break;
            }
        }
        return countBall == m;
    }
}