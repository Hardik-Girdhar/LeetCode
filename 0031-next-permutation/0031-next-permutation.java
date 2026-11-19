class Solution {
    public void nextPermutation(int[] nums) {
        int idx1 = -1;
        int idx2 = -1;
        int n = nums.length;

        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                idx1 = i;
                break;
            }
        }

        if(idx1 == -1){
            reverse(nums, 0);
        }
        else{
            for(int i=n-1; i>=0; i--){
                if(nums[i] > nums[idx1]){
                    idx2 = i;
                    break;
                }
            }

            swap(nums, idx1, idx2);
            reverse(nums, idx1+1);
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int s){
        int e = nums.length-1;
        while(s<e){
            swap(nums, s, e);
            s++;
            e--;
        }
    }
}