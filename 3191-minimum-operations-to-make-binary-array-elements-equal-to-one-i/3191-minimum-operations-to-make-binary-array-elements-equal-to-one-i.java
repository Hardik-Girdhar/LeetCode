// 995

// class Solution {
//     public int minOperations(int[] nums) {
//         int k=3;
//         int ans = 0;
//         int flipcount=0;
//         boolean[] isFlip = new boolean[nums.length];
//         for(int i=0;i<nums.length;i++){
//             if(i>=k && isFlip[i-k]==true){
//                 flipcount--;
//             }
//             if(flipcount % 2== nums[i]){
//                 if(i+k>nums.length){
//                     return -1;
//                 }
//                 flipcount++;
//                 ans++;
//                 isFlip[i] = true;
//             }
//         }
//         return ans;
//     }
// }

// class Solution {
//     public int minOperations(int[] nums) {
//         int k=3;
//         int ans = 0;
//         int flipcount = 0;
//         for(int i=0;i<nums.length;i++){
//             if(i>=k && nums[i-k] == 2){
//                 flipcount--;
//             }
//             if(flipcount % 2 == nums[i]){
//                 if(i+k>nums.length){
//                     return -1;
//                 }
//                 flipcount++;
//                 ans++;
//                 nums[i]=2;
//             }
//         }
//         return ans;
//     }
// }


// class Solution {
//     public int minOperations(int[] nums) {
//         int k=3;
//         int ans=0;
//         int flipcount=0;
//         Deque<Integer> dq = new LinkedList<>();
//         for(int i=0;i<nums.length ; i++){
//             if(i>=k){
//                 flipcount -= dq.pollFirst();
//             }
//             if(flipcount % 2== nums[i]){
//                 if(i+k>nums.length){
//                     return -1;
//                 }
//                 dq.addLast(1);
//                 flipcount++;
//                 ans++;
//             }
//             else{
//                 dq.addLast(0);
//             }
//         }   
//         return ans;
//     }
// }







































class Solution {
    public int minOperations(int[] nums) {
        int k=3;
        int ans=0;
        int flipcount = 0;
        boolean[] isFlip = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i>=k && isFlip[i-k]==true){
                flipcount--;
            }
            if(flipcount % 2 == nums[i]){
                if(i+k > nums.length){
                    return -1;
                }
                flipcount++;
                isFlip[i]=true;
                ans++;
            }
        }
        return ans;
    }
}