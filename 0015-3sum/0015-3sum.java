class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        HashSet<List<Integer>> set = new HashSet<>();

        for(int i=0; i<n; i++){
            HashSet<Integer> st = new HashSet<>();
            for(int j=i+1; j<n; j++){
                int third = -(nums[i] + nums[j]);
                if(st.contains(third)){
                    List<Integer> list = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(list);
                    set.add(list);
                }

                st.add(nums[j]);
            }
        }

        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }
}