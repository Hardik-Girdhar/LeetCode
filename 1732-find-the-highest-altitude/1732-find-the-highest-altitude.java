class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int arr[] = new int[gain.length+1];
        arr[0] = 0;
        for(int i=0;i<gain.length;i++){
            arr[i+1] = gain[i]+arr[i];
        }
        for(int i:arr){
            max = Math.max(max,i);
        }
        return max;
    }
}