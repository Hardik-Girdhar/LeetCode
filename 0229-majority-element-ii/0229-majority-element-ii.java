// // O(n^2) + O(n) -> need to optimize it
// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         int n = nums.length;
//         HashSet<Integer> set = new HashSet<>();

//         for(int i=0; i<n; i++){
//             int count = 0;
//             for(int j=0; j<n; j++){
//                 if(nums[i] == nums[j]) count++;
//             }

//             if(count > n/3) set.add(nums[i]);
//         }
        
//         List<Integer> list = new ArrayList<>(set);
//         return list;
//     }
// }



// // O(n), O(n) -> Because of space (O(n)) we need to optimize it
// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         int n = nums.length;
//         List<Integer> list = new ArrayList<>();
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int num: nums){
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//             if(entry.getValue() > n/3) list.add(entry.getKey()); 
//         }

//         return list;
//     }
// }



// Moore's voting algo - O(N)
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
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
            // else if(ele1 == num){
            //     count1++;
            // }
            // else if(ele2 == num){
            //     count2++;
            // }
            else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for(int num : nums){
            if(ele1 == num) count1++;
            else if(ele2 == num) count2++;
        }
        if(count1 > n/3) list.add(ele1);
        if(count2 > n/3) list.add(ele2);

        return list;
    }
}