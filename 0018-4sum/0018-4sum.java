class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        HashSet<List<Integer>> set = new HashSet<>();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                HashSet<Long> st = new HashSet<>();
                for(int k=j+1; k<n; k++){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];

                    long needMore = target - sum;

                    if(st.contains(needMore)){
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k], (int) needMore);
                        Collections.sort(list);
                        set.add(list);
                    }

                    st.add((long)nums[k]);
                }
            }
        }
        
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}