// COUNTING SORT - O(n+k)
class Solution {
    public int[] sortArray(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            min = Math.min(min,num);
            max = Math.max(max,num);
        }

        int idx=0;
        for(int i=min;i<=max;i++){
            while(map.getOrDefault(i,0)>0){
                nums[idx] = i;
                idx++;
                map.put(i,map.get(i)-1);
            }
        }
        return nums;
    }
}


// MERGE SORT - O(nlogn)
// class Solution {
//     public int[] sortArray(int[] nums) {
//         int s = 0;
//         int e = nums.length-1;
//         mergeSort(nums, s, e);
//         return nums;
//     }

//     private void mergeSort(int[] arr, int s, int e){
//         if(s == e){
//             return;
//         }

//         int mid = s + (e-s)/2;
//         mergeSort(arr, s, mid);
//         mergeSort(arr, mid+1, e);
//         merge(arr, s, mid, e);
//     }

//     private void merge(int[]arr, int s, int mid, int e){
//         int[] temp = new int[e-s+1];
//         int i=s;
//         int j=mid+1;
//         int k=0;
//         while(i<=mid && j<=e){
//             if(arr[i] < arr[j]){
//                 temp[k++] = arr[i++];
//             }
//             else{
//                 temp[k++] = arr[j++];
//             }
//         }
//         while(i<=mid){
//             temp[k++] = arr[i++];
//         }
//         while(j<=e){
//             temp[k++] = arr[j++];
//         }

//         int m=s;
//         for(int ele:temp){
//             arr[m++] = ele;
//         }
//     }
// }

// // QUICK SORT - O(nlogn)
// class Solution {
//     public int[] sortArray(int[] nums) {
//         quickSort(nums,0,nums.length-1);
//         return nums;
//     }

//     private void quickSort(int[] arr, int s, int e){
//         if(s>=e){
//             return;
//         }

//         int pidx = partition(arr, s, e);

//         quickSort(arr, s, pidx-1);
//         quickSort(arr, pidx+1, e);
//     }

//     private int partition(int[] arr, int s, int e){
//         int pivot = arr[e];
//         int i = s-1;
//         for(int j=s; j<e; j++){
//             if(arr[j] <= pivot){
//                 i++;
//                 swap(arr, i, j);
//             }
//         }
//         i++;
//         swap(arr, e, i);
//         return i;
//     }

//     private void swap(int[] arr, int i, int j){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
// }