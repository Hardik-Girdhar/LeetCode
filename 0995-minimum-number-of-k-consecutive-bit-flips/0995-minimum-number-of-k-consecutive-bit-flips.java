// class Solution {
//     public int minKBitFlips(int[] nums, int k) {
//         int n = nums.length, flipped = 0, res = 0;
//         int[] isFlipped = new int[n];
//         for (int i = 0; i < nums.length; ++i) {
//             if (i >= k)
//                 flipped ^= isFlipped[i - k];
//                 if (flipped == nums[i]) {
//                     if (i + k > nums.length)
//                         return -1;
//                 isFlipped[i] = 1;
//                 flipped ^= 1;
//                 res++;
//             }
//         }
//         return res;
//     }
// }

class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int flip = 0;
        int flipcount = 0;
        boolean isflip[] = new boolean[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(i>=k && isflip[i-k] == true){
                flipcount--;
            }
            if(flipcount % 2 == nums[i]){     // even - same rhege mtlb 0 ko 1, odd - opp 1 ko 0
                if(i+k > nums.length){
                    return -1;
                }
                flipcount++;
                isflip[i] = true;
                flip++;
            }
        }
        return flip;
    }
}