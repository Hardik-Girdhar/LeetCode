class Solution {
    public void nextPermutation(int[] nums) {
        int idx1 = -1;
        int n = nums.length;
        for(int i = n-2 ; i>=0 ; i--)   // 1-> find breaking point -- -2 -- no change
        {
            if(nums[i] < nums[i+1])
            {
                idx1 = i;
                break;
            }
        }
        if(idx1 == -1)   // already the highest just rev and make it first
        {
            reverse(nums , 0);
        }
        else   // 2 -> swap idx with slightly greater than it and smaller than other
        {
            for(int i=n-1 ; i>=0 ; i--)
            {
                if(nums[i] > nums[idx1])
                {
                    swap(nums , idx1 , i);
                    break;
                }
            }

            reverse(nums , idx1+1);  // 3-> sort small to large after idx element  
        }
    }

    public void swap(int[] arr , int a , int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void reverse(int[] arr , int s)
    {
        int e = arr.length - 1;
        while(s<e)
        {
            swap(arr,s,e);
            s++;
            e--;
        }
    }
}