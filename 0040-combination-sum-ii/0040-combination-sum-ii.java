// // class Solution {
// //     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
// //         Set<List<Integer>> set = new HashSet<>();
// //         List<Integer> list = new ArrayList<>();

// //         Arrays.sort(candidates);
// //         backTrack(0, candidates, target, list, set);
        
// //         List<List<Integer>> ans = new ArrayList<>(set);

// //         return ans;
// //     }

// //     private void backTrack(int idx, int[] nums, int target, List<Integer> list, Set<List<Integer>> set){
// //         if(idx == nums.length){
// //             if(target == 0){
// //                 set.add(new ArrayList<>(list));
// //             }
// //             return;
// //         }

// //         list.add(nums[idx]);
// //         backTrack(idx+1, nums, target-nums[idx], list, set);
// //         list.remove(list.size()-1);
// //         backTrack(idx+1, nums, target, list, set);
// //     }
// // }


// class Solution {
//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         List<List<Integer>> ans = new ArrayList<>();
//         List<Integer> list = new ArrayList<>();

//         Arrays.sort(candidates);
//         backTrack(0, candidates, target, list, ans);

//         return ans;
//     }

//     private void backTrack(int idx, int[] nums, int target, List<Integer> list, List<List<Integer>> ans){
//         if(target == 0){
//             ans.add(new ArrayList<>(list));
//             return;
//         }

//         for(int i=idx; i<nums.length; i++){
//             if(i != idx && nums[i] == nums[i-1]) continue;
//             if(target < nums[i]) continue;

//             list.add(nums[i]);
//             backTrack(i+1, nums, target-nums[i], list,ans);
//             list.remove(list.size()-1);
//         }
//     }
// }



class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(0, candidates, target, list, ans);
        return ans;
    }

    private void backTrack(int idx, int[] nums, int target, List<Integer>list, List<List<Integer>>ans){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx; i<nums.length; i++){
            if(target < nums[i]) continue;
            if(i != idx && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            backTrack(i+1, nums, target-nums[i], list,ans);
            list.remove(list.size()-1);
        }
    }
}