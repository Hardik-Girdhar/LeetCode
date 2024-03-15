class Solution {
    public int subarraySum(int[] nums, int key) {
        int count=0;
        for(int i=0 ; i<nums.length; i++){
                int sum =0 ;
            for(int j =i;j<nums.length;j++){
                    sum = sum + nums[j];
                if(sum == key)
                {
                    count++;
                }
            }
        }
        return count;
    }
}

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