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