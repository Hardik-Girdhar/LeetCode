// // Brute force
// class Solution {
//     public int reversePairs(int[] nums) {
//         int count = 0;
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i] > 2L * nums[j]) count++; 
//             }
//         }

//         return count;
//     }
// }



// // OPTIMAL - MERGE SORT USE -> TO CALCULATE LEFT SIDE RIGHT SIDE INVERSION
// // Count taken to as global variable
// class Solution {
//     public int count = 0;
//     public int reversePairs(int[] nums) {
//         mergeSort(nums, 0, nums.length-1);
//         return count;
//     }

//     public void mergeSort(int[] nums, int start, int end){
//         if(start >= end) return;

//         int mid = start + (end - start)/2;

//         mergeSort(nums, start, mid);
//         mergeSort(nums, mid+1, end);
//         countPairs(nums, start, mid, end);
//         merge(nums, start, mid, end);
//     }

//     public void countPairs(int[] nums, int start, int mid, int end){
//         int right = mid+1;
        
//         for(int i=start; i<=mid; i++){
//             while(right <= end && nums[i] > 2L*nums[right]){
//                 right++;
//             }

//             count += (right - (mid+1));
//         }
//     }

//     public void merge(int[] nums, int start, int mid, int end){
//         int[] temp = new int[end - start + 1];
//         int k = 0;
//         int i = start;
//         int j = mid+1;

//         while(i<=mid && j<=end){
//             if(nums[i] <= nums[j]){
//                 temp[k++] = nums[i++];
//             }
//             else{
//                 temp[k++] = nums[j++];
//             }
//         }

//         while(i<=mid){
//             temp[k++] = nums[i++];
//         }

//         while(j<=end){
//             temp[k++] = nums[j++];
//         }

//         for(int x=0; x<temp.length; x++){
//             nums[start + x] = temp[x];
//         }
//     }
// }




// OPTIMAL - MERGE SORT USE -> TO CALCULATE LEFT SIDE RIGHT SIDE INVERSION
// Count taken to variable
class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    public int mergeSort(int[] nums, int start, int end){
        int count = 0;
        if(start >= end) return count;

        int mid = start + (end - start)/2;

        count += mergeSort(nums, start, mid);
        count += mergeSort(nums, mid+1, end);
        count += countPairs(nums, start, mid, end);
        merge(nums, start, mid, end);

        return count;
    }

    public int countPairs(int[] nums, int start, int mid, int end){
        int count = 0;
        int right = mid+1;
        
        for(int i=start; i<=mid; i++){
            while(right <= end && nums[i] > 2L*nums[right]){
                right++;
            }

            count += (right - (mid+1));
        }

        return count;
    }

    public void merge(int[] nums, int start, int mid, int end){
        int[] temp = new int[end - start + 1];
        int k = 0;
        int i = start;
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
            nums[start + x] = temp[x];
        }
    }
}