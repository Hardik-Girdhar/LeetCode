// OPTIMAL - HASH - n
class Solution {
    public int subarraySum(int[] nums, int key) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum =0;
        int count=0;
        for(int i =0;i<nums.length; i++)
        {
            sum = sum+nums[i];
            int remove = sum - key;
            if(map.containsKey(remove))
            {
                count = count+map.get(remove);
            }
            map.put(sum , map.getOrDefault(sum , 0)+1);
        }
        return count;
    }
}

// BRUTE FORCE - n^2
// class Solution {
//     public int subarraySum(int[] nums, int key) {
//         int count=0;
//         for(int i=0 ; i<nums.length; i++){
//                 int sum =0 ;
//             for(int j =i;j<nums.length;j++){
//                     sum = sum + nums[j];
//                 if(sum == key)
//                 {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

// BRUTE FORCE  - n^3
// class Solution {
//     public int subarraySum(int[] nums, int key) {
//         int count=0;
//         for(int i=0 ; i<nums.length; i++){
//             for(int j =i;j<nums.length;j++){
//                 int sum =0 ;
//                 for(int k=i;k<=j ;k++){
//                     sum = sum + nums[k];
//                 }
//                 if(sum == key)
//                 {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }