// // O(n^3)
// class Solution {
//     public int maxProduct(int[] nums) {
//         int maxProd = Integer.MIN_VALUE;
//         int n = nums.length;
//         for(int i=0; i<n; i++){
//             for(int j=i; j<n; j++){
//                 int currProd = 1;
//                 for(int k=i; k<=j; k++){
//                     currProd *= nums[k];
//                 }
//                 maxProd = Math.max(maxProd, currProd);
//             }
//         }

//         return maxProd;
//     }
// }



// // O(n^2)
// class Solution {
//     public int maxProduct(int[] nums) {
//         int maxProd = Integer.MIN_VALUE;
//         int n = nums.length;
//         for(int i=0; i<n; i++){
//             int currProd = 1;
//             for(int j=i; j<n; j++){
//                 currProd *= nums[j];
//                 maxProd = Math.max(maxProd, currProd);
//             }
//         }

//         return maxProd;
//     }
// }


// // O(n)
class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix *= nums[i];
            suffix *= nums[n-i-1];
            maxProd = Math.max(maxProd, Math.max(prefix, suffix));
        }

        return maxProd;
    }
}