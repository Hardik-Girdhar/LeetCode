// class Solution {
//     public List<List<Integer>> permute(int[] nums) {
        // List<List<Integer>> ans = new ArrayList<>();
        // List<Integer> list = new ArrayList<>();

        // boolean[] taken = new boolean[nums.length];

        // backTrack(nums, taken, list, ans);

        // return ans;
//     }

//     private void backTrack(int[] nums, boolean[] taken, List<Integer> list, List<List<Integer>> ans){
//         if(list.size() == nums.length){
//             ans.add(new ArrayList<>(list));
//             return;
//         }

//         for(int i=0; i<nums.length; i++){
//             if(!taken[i]){
//                 taken[i] = true;
//                 list.add(nums[i]);
//                 backTrack(nums, taken, list, ans);
//                 taken[i] = false;
//                 list.remove(list.size()-1);
//             }
//         }
//     }
// }

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        backTrack(0, nums, ans);

        return ans;
    }

    private void backTrack(int idx, int nums[], List<List<Integer>> ans){
        if(idx == nums.length){
            List<Integer> list = new ArrayList<>();
            for(int num : nums){
                list.add(num);
            }
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx; i<nums.length; i++){
            swap(nums, i, idx);
            backTrack(idx+1, nums, ans);
            swap(nums, i, idx);
        }
    }

    private void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}