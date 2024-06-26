// BEST APPROACH - N , LOGN
class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int ans = 0;
        int flipcount=0;
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(i>=k){
                flipcount -= dq.pollFirst();
            }
            
            if(flipcount % 2 == nums[i]){
                if(i+k > nums.length){
                    return -1;
                }
                flipcount++;
                ans++;
                dq.addLast(1);
            }
            else{
                dq.addLast(0);
            }
        }
        return ans;
    }
}


// time compexity - O(n) , space = o(n)
// class Solution {
//     public int minKBitFlips(int[] nums, int k) {
//         int flip = 0;
//         int flipcount = 0;
//         boolean isflip[] = new boolean[nums.length];
        
//         for(int i=0;i<nums.length;i++){
//             if(i>=k && isflip[i-k] == true){
//                 flipcount--;
//             }
//             if(flipcount % 2 == nums[i]){     // even - same rhege mtlb 0 ko 1, odd - opp 1 ko 0
//                 if(i+k > nums.length){
//                     return -1;
//                 }
//                 flipcount++;
//                 isflip[i] = true;
//                 flip++;
//             }
//         }
//         return flip;
//     }
// }

// remove that extra swpace array - 
// time - O(n) , space - O(1)
// class Solution {
//     public int minKBitFlips(int[] nums, int k) {
//         int ans = 0;
//         int flipcount=0;
//         for(int i=0;i<nums.length;i++){
//             if(i>=k && nums[i-k] == 2){
//                 flipcount--;
//             }
            
//             if(flipcount%2 == nums[i]){
//                 if(i+k > nums.length){
//                     return -1;
//                 }
//                 nums[i]=2;
//                 flipcount++;
//                 ans++;
//             }
//         }
//         return ans;
//     }
// }
