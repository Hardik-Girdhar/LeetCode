class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int s = 0;
        int e = nums.length-1;
        int i=nums.length-1;
        while(s<=e){
            if(Math.abs(nums[s]) > Math.abs(nums[e])){
                arr[i] = nums[s]*nums[s]; 
                s++;
            }
            else{
                arr[i] = nums[e]*nums[e]; 
                e--;
            }
            i--;
        }
        return arr;
    }
}



// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         for(int i=0;i<nums.length; i++){
//             nums[i] *= nums[i];
//         }
//         Arrays.sort(nums);
//         return nums;
//     }
// }