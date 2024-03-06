class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
        
        // HashMap<Integer , Integer> map = new HashMap<>();
        // for(int i=0 ; i<nums.length ; i++)
        // {
        //     map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
        // }
        // for(Integer key: map.keySet())
        // {
        //     if(map.get(key)>nums.length/2)
        //     {
        //         return key;
        //     }
        // }
        // return 0;
    }
}