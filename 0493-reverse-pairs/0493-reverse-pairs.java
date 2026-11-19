// class Solution {
//     public int reversePairs(int[] nums) {
//         int count = 0;
//         int n = nums.length;

//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 if(nums[i] > 2L*nums[j]) count++;
//             }
//         }

//         return count;
//     }
// }


class Solution {
    // public int count = 0;
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
        // return count;
    }

    public int mergeSort(int[] nums, int low, int high){
        int count = 0;
        if(low >= high) return count;

        int mid = low + (high-low)/2;

        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid+1, high);
        count += countReverse(nums, low, mid, high);
        merge(nums, low, mid, high);

        return count;
    }

    public int countReverse(int[] nums, int low, int mid, int high){
        int count = 0;
        int right = mid+1;

        for(int i=low; i<=mid; i++){
            while(right <= high && nums[i] > 2L*nums[right]){
               right++;
            }

            count += right - (mid+1);
        }

        return count;
    }

    public void merge(int[] nums, int low, int mid, int end){
        int[] temp = new int[end - low + 1];
        int k = 0;
        int i = low;
        int j = mid+1;

        while(i<=mid && j<=end){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }
            else{
                temp[k++] = nums[j++];
            }
        }

        while(i<=mid){
            temp[k++] = nums[i++];
        }

        while(j<=end){
            temp[k++] = nums[j++];
        }

        for(int x=0; x<temp.length; x++){
            nums[low + x] = temp[x];
        }
    }
}