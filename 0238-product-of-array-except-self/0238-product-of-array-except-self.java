// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] arr = new int[n];
//         int[] left = new int[n];
//         int[] right = new int[n];
        
//         // Initialize the left array
//         left[0] = 1;  // No elements to the left of the first element
//         for (int i = 1; i < n; i++) {
//             left[i] = left[i - 1] * nums[i - 1];
//         }
        
//         // Initialize the right array
//         right[n - 1] = 1;  // No elements to the right of the last element
//         for (int i = n - 2; i >= 0; i--) {
//             right[i] = right[i + 1] * nums[i + 1];
//         }
        
//         // Construct the result array
//         for (int i = 0; i < n; i++) {
//             arr[i] = left[i] * right[i];
//         }
//         return arr;
//     }
// }

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right =new int[nums.length];
        left[0]=1;
        for(int i=1;i<nums.length;i++){
            left[i] = left[i-1] * nums[i-1];
        }
        right[nums.length-1] = 1;
        for(int i=nums.length-2;i>=0;i--){
            right[i] = right[i+1]*nums[i+1];
        }
        
        for(int i=0;i<nums.length;i++){
            arr[i] = left[i]*right[i];
        }
        return arr;
    }
}

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int arr[] = new int[nums.length];
//         int product = 1;
//         for(int i =0;i<nums.length;i++){
//             product = product*nums[i];
//         }
//         for(int i=0;i<arr.length;i++){
//             arr[i] = product/nums[i];
//         }
//         return arr;
//     }
// }

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int[] arr = new int [nums.length];
//         for(int i=0;i<nums.length;i++){
//             int j=0;
//             int ans=1;
//             while(j<nums.length){
//                 if(i==j){
//                     continue;
//                 }
//                 else{
//                     ans = ans*nums[j];
//                 }
//                 j++;
//             }
//             arr[i]=ans;
//         }
//         return arr;
//     }
// }