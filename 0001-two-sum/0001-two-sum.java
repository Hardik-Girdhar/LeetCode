class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int needMore = target - nums[i];
            if(map.containsKey(needMore)){
                return new int[]{i,map.get(needMore)};
            }
            map.put(nums[i],i);
        } 
        return null;
    }
}


// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i] + nums[j] == target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return null;
//     }
// }


// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Arrays.sort(nums);
//         int s=0;
//         int e = nums.length-1;
//         while(s<=e){
//             if(nums[s] + nums[e] == target){
//                 return new int[]{s,e};
//             }
//             else if(nums[s] + nums[e] > target){
//                 e--;
//             }
//             else{
//                 s++;
//             }
//         }
//     }
// }