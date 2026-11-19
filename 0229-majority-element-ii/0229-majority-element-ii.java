class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=i; j<n; j++){
                if(nums[i] == nums[j]) count++;
            }

            if(count > n/3) set.add(nums[i]);
        }

        List<Integer> list = new ArrayList<>(set);
        return list;
    }
}