class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k<0)
        {
            k = k + nums.length;
        }
        reverse(nums,0,nums.length-1);
        reverse(nums , 0 , k-1);
        reverse(nums , k , nums.length-1);
        
    }
    public void reverse(int[] arr , int s , int e)
    {
        while(s<e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}