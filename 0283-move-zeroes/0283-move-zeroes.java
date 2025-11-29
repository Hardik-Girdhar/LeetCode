class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1 && nums[0] == 0) return;
        int zero = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                zero = i;
                break;
            }
        }
        if(zero == -1) return;
        for(int i=zero+1; i<nums.length; i++){
            if(nums[i] != 0){
                swap(nums, zero, i);
                zero++;
            }
        }

    }
    private void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}