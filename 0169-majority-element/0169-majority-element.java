// // O(n^2) - too much high
// class Solution {
//     public int majorityElement(int[] nums) {

//         int n = nums.length;

//         for(int i=0; i<n; i++){
//             int count = 0;
//             for(int j=0; j<n; j++){
//                 if(nums[i] == nums[j]) count++;
//             }
//             if(count > n/2) return nums[i];
//         }

//         return 0;
//     }
// }


// // O(nlogn) - High as well as
// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length/2];
//     }
// }

// // O(n) + O(n) -> O(n)
// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int a : nums){
//             map.put(a, map.getOrDefault(a, 0) + 1);
//         }

//         for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//             if(entry.getValue() > nums.length/2) return entry.getKey();
//         }

//         return 0;
//     }
// }


// Moore's voting algorithm -> O(n)
class Solution {
    public int majorityElement(int[] nums) {
       int count = 0;
       int ele = -1;

        for(int num: nums){
            if(count == 0){
                count = 1;
                ele = num;
            }
            else if(num == ele){
                count++;
            }
            else{
                count--;
            }
        }

       return ele;
    }
}