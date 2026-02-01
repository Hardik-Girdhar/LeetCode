class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        backTrack(0, candidates, target, list, ans);
        return ans;
    }

    private void backTrack(int idx, int[] nums, int target, List<Integer> list, List<List<Integer>> ans){
        if(idx == nums.length){
            if(target == 0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        if(nums[idx] <= target){
            list.add(nums[idx]);
            backTrack(idx, nums, target-nums[idx], list, ans);
            list.remove(list.size() -1);
        }
        backTrack(idx+1, nums, target, list, ans);
    }
}