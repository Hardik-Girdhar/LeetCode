class Solution {
    public boolean check(int[] nums) 
    {
        if(nums.length == 1)
        {
            return true;
        }
        int count=0;
        for(int i = 1 ; i <nums.length ; i++)
        {
            if(nums[i-1]>nums[i])
            {
                count++;
            }
        }
        if(nums[nums.length - 1] > nums[0])
        {
            count++;
        }
        return count<=1;
    }
}
