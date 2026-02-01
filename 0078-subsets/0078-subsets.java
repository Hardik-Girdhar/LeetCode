class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        backTrack(0, nums, list, ans);
        return ans;
    }

    private void backTrack(int idx, int[] nums, List<Integer> list, List<List<Integer>> ans){
        // if(idx >= nums.length){
        //     ans.add(new ArrayList<>(list));
        //     return;
        // }

        // list.add(nums[idx]);
        // backTrack(idx+1, nums, list, ans);
        // list.remove(list.size()-1);
        // backTrack(idx+1, nums, list, ans);

        ans.add(new ArrayList<>(list));
        // return;

        for(int i=idx; i<nums.length; i++){
            list.add(nums[i]);
            backTrack(i+1, nums, list, ans);
            list.remove(list.size()-1);
        }
    }
}




