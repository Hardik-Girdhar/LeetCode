class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        
        while(true){
            boolean found = false;
            int s=0;
            int e=nums.length-1;
            while(s<=e){
                int mid = s + (e-s)/2;
                if(nums[mid] == original){
                    found = true;
                    break;
                }
                else if(nums[mid] < original){
                    s = mid + 1;
                }else{
                    e = mid-1;
                }
            }

            if(found){
                original *= 2;
            }else{
                break;
            }
        }

        return original;
    }
}