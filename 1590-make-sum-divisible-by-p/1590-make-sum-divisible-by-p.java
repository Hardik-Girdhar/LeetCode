class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for (int num : nums) total += num;

        int rem = (int)(total % p);
        if (rem == 0) return 0; // already divisible

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // prefix sum before start

        int minLen = nums.length;
        int prefix = 0;

        for (int i = 0; i < nums.length; i++) {
            prefix = (prefix + nums[i]) % p;

            // ensure positive modulo
            int needed = (prefix - rem + p) % p;

            if (map.containsKey(needed)) {
                minLen = Math.min(minLen, i - map.get(needed));
            }

            map.put(prefix, i);
        }

        return minLen == nums.length ? -1 : minLen;
    }
}


// class Solution {
//     public int minSubarray(int[] nums, int p) {
//         long sum = 0;
//         for(int num : nums) sum += num;

//         int rem = (int) sum % p;
//         if(rem == 0) return 0;

//         int minLength = nums.length;
//         int[] prefixSum = new int[nums.length];
//         prefixSum[0] = nums[0];
//         for(int i=1; i<nums.length; i++){
//             prefixSum[i] = nums[i] + prefixSum[i-1];
//         }

//         for(int i=0; i<nums.length; i++){
//             for(int j=i; j<nums.length; j++){
//                 long currSum = prefixSum[j] - (i>0 ? prefixSum[i-1] : 0);

//                 if(currSum % p == rem){
//                     minLength = Math.min(minLength, j-i+1);
//                 }
//             }
//         }

//         return minLength == nums.length ? -1 : minLength;
//     }
// }


// class Solution {
//     public int minSubarray(int[] nums, int p) {
//         long sum = 0;
//         for(int num : nums){
//             sum += num;
//         }

//         int rem = (int) sum % p;
//         if(rem == 0) return 0;

//         int n = nums.length;
//         int minLength = n;

//         for(int i=0; i<nums.length; i++){
//             for(int j=i; j<nums.length; j++){
//                 long currSum = 0;
//                 for(int k=i; k<=j; k++){
//                     currSum += nums[k];
//                 }
//                 if(currSum % p == rem){
//                     minLength = Math.min(minLength, j-i+1);
//                 }
//             }
//         }

//         return minLength == n ? -1 : minLength;
//     }
// }