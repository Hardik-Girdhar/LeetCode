// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i=0; i<nums.length - 1; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(target == nums[i] + nums[j]){
//                     return new int[]{i,j};
//                 }
//             }
//         }

//         return null;
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int needmore = target - nums[i];
            if(map.containsKey(needmore)){
                return new int[]{i, map.get(needmore)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}