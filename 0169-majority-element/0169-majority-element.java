// class Solution {
//     public int majorityElement(int[] nums) {
//         for(int i=0; i<nums.length; i++){
//             int count = 0;
//             for(int j=i; j<nums.length; j++){
//                 if(nums[i] == nums[j]) count++;
//             }   

//             if(count > nums.length/2) return nums[i];
//         }

//         return -1;
//     }
// }


// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int n = nums.length;
//         for(int num : nums){
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }
//         for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//             if(entry.getValue() > n/2) return entry.getKey();
//         }
//         return -1;
//     }
// }


class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ele = -1;
        int n = nums.length;
        for(int num : nums){
            if(count == 0){
                count = 1;
                ele = num;
            }
            else if(ele == num){
                count++;
            }
            else{
                count--;
            }
        }

        return ele;
    }
}