class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       HashSet<List<Integer>>set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            HashSet<Integer> hashset = new HashSet<>(); 
            for(int j=i+1;j<nums.length;j++)
            {
                int third = -(nums[i]+nums[j]);
                if(hashset.contains(third))
                {
                    List<Integer>temp = Arrays.asList(nums[i],nums[j],third);
                    temp.sort(null);
                    set.add(temp);
                }
                else
                {
                    hashset.add(nums[j]);
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>(set);
        return list;
        
        
        // HashSet<List<Integer>> set = new HashSet<>();
        // for(int i=0 ;i<nums.length ; i++)
        // {
        //     for(int j =i+1;j<nums.length;j++)
        //     {
        //         for(int k=j+1 ;k<nums.length;k++)
        //         {
        //             if(nums[i]+nums[j]+nums[k] == 0)
        //             {
        //                 List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
        //                 list.sort(null);
        //                 set.add(list);
        //             }
        //         }
        //     }
        // }
        // List<List<Integer>> main = new ArrayList<>(set);
        // return main;
    }
}