// // BETTER APPROACH - but 2 auxilary array space- prefix, suffix array
// // O(3n), O(2n)
// class Solution {
//     public int trap(int[] height) {
//         int total = 0;
//         int leftMax[] = prefixMax(height);    // O(n)
//         int rightMax[] = suffixMax(height);   // O(n)
//         for(int i=0; i<height.length; i++){   // O(n)
//             int lm = leftMax[i];
//             int rm = rightMax[i];
//             total += Math.min(lm, rm) - height[i];
//         }
//         return total;
//     }
//     private int[] prefixMax(int[] height){
//         int n = height.length;
//         int[] prefix = new int[n];
//         prefix[0] = height[0];
//         for(int i=1; i<n; i++){
//             prefix[i] = Math.max(height[i], prefix[i-1]);
//         }
//         return prefix;
//     }
//     private int[] suffixMax(int[] height){
//         int n = height.length;
//         int[] suffix = new int[n];
//         suffix[n-1] = height[n-1];
//         for(int i=n-2; i>=0; i--){
//             suffix[i] = Math.max(height[i], suffix[i+1]);
//         }
//         return suffix;
//     }
// }



// class Solution {
//     public int trap(int[] height) {
//         int water = 0;

//         int n = height.length;

//         int[] lmax = new int[n];
//         int[] rmax = new int[n];

//         lmax[0] = height[0];
//         rmax[n-1] = height[n-1];

//         for(int i=1; i<n; i++){
//             lmax[i] = Math.max(lmax[i-1], height[i]);
//         }

//         for(int i=n-2; i>=0; i--){
//             rmax[i] = Math.max(rmax[i+1], height[i]);
//         }

//         for(int i=0; i<n; i++){
//             water += Math.min(lmax[i], rmax[i]) - height[i];
//         }

//         return water;
//     }
// }



// OPTIMIZED APPROACH - 2 pointer approach
// No extra space required
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int lMax = 0;
        int rMax = 0;
        int water = 0;

        while(l < r){
            lMax = Math.max(lMax, height[l]);
            rMax = Math.max(rMax, height[r]);

            if(lMax < rMax){
                water += lMax - height[l];
                l++;
            }
            else{
                water += rMax - height[r];
                r--;
            }
        }
        return water;
    }
}