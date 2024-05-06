class Solution {
    public int[] twoSum(int[] nums, int target) {
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
    }
}