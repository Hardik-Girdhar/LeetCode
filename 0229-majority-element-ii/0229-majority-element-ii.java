// // class Solution {
// //     public List<Integer> majorityElement(int[] nums) {
// //         int n = nums.length;
// //         HashSet<Integer> set = new HashSet<>();
// //         for(int i=0; i<n; i++){
// //             int count = 0;
// //             for(int j=i; j<n; j++){
// //                 if(nums[i] == nums[j]) count++;
// //             }

// //             if(count > n/3) set.add(nums[i]);
// //         }

// //         List<Integer> list = new ArrayList<>(set);
// //         return list;
// //     }
// // }


// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         List<Integer> list = new ArrayList<>();
//         for(int num: nums){
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//             if(entry.getValue() > nums.length/3) list.add(entry.getKey());
//         }

//         return list;
//     }
// }


class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;
        int ele1 = -1;
        int ele2 = -1;

        for(int num : nums){
            if(ele1 == num){
                count1++;
            }
            else if(ele2 == num){
                count2++;
            }
            else if(count1 == 0){
                count1 = 1;
                ele1 = num;
            }
            else if(count2 == 0){
                count2 = 1;
                ele2 = num;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for(int i=0; i<nums.length; i++){
            if(ele1 == nums[i]) count1++;
            else if(ele2 == nums[i]) count2++;
        }

        if(count1 > nums.length/3) list.add(ele1);
        if(count2 > nums.length/3) list.add(ele2);

        return list;
    }
}