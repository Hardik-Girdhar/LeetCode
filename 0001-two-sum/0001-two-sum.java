class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Arrays.sort(nums);
        // int s=0;
        // int e = nums.length-1;
        // int ans[] = {-1,-1};
        // while(s<=e)
        // {
        //     int sum = nums[s] + nums[e];
        //     if(sum == target)
        //     {
        //         return new int[]{s,e};
        //     }
        //     else if(sum<target)
        //     {
        //         s++;
        //     }
        //     else
        //     {
        //         e--;
        //     }
        // }
        // return ans;


        int ans[] = new int[2];   // hashing n   // better approach
        ans[0]=ans[1]=-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i <nums.length ; i++)
        {
            int num = nums[i];
            int needmore = target - num;
            if(map.containsKey(needmore))
            {
                ans[0]=i;
                ans[1] = map.get(needmore);
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;



        // for(int i=0 ; i<nums.length ; i++)     // BRUTE FORCE n^2  
        // {
        //     for(int j=i+1 ; j<nums.length ; j++)
        //     {
        //         if(target == nums[i] + nums[j])
        //         {
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return null;
    }
}