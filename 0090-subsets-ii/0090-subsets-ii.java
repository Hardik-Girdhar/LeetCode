// class Solution {
//     public List<List<Integer>> subsetsWithDup(int[] nums) {
//         Set<List<Integer>> set = new HashSet<>();
//         List<Integer> list = new ArrayList<>();

//         Arrays.sort(nums);
//         backTrack(0, nums, list, set);
//         List<List<Integer>> ans = new ArrayList<>(set);
//         return ans;
//     }

//     private void backTrack(int idx, int[] nums, List<Integer> list, Set<List<Integer>> set){
//         if(idx >= nums.length){
//             set.add(new ArrayList<>(list));
//             return;
//         }

        // list.add(nums[idx]);
        // backTrack(idx+1, nums, list, set);
        // list.remove(list.size()-1);
        // backTrack(idx+1, nums, list, set);
//     }
// }


// class Solution {
//     public List<List<Integer>> subsetsWithDup(int[] nums) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     List<Integer> list = new ArrayList<>();

    //     Arrays.sort(nums);
    //     backTrack(0, nums, list, ans);
    //     return ans;
    // }

//     private void backTrack(int idx, int nums[], List<Integer> list, List<List<Integer>> ans){
//         if(idx >= nums.length){
//             ans.add(new ArrayList(list));
//             return;
//         }

//         list.add(nums[idx]);
//         backTrack(idx+1, nums, list, ans);
//         list.remove(list.size()-1);
//         while(idx+1 < nums.length && nums[idx] == nums[idx+1]) idx++;
//         backTrack(idx+1, nums, list, ans);


//     }
// }


class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);
        backTrack(0, nums, list, ans);
        return ans;
    }

    private void backTrack(int idx, int[] nums, List<Integer> list, List<List<Integer>> ans){
        ans.add(new ArrayList<>(list));

        for(int i=idx; i<nums.length; i++){
            if(i != idx && nums[i] == nums[i-1]) continue;

            list.add(nums[i]);
            backTrack(i+1, nums, list, ans);
            list.remove(list.size()-1);
        }
    }
}
