// // class Solution {
// //     public void sortColors(int[] nums) {
// //         Arrays.sort(nums);
// //     }
// // }

// class Solution {
//     public void sortColors(int[] nums) {
//         int s=0;
//         int m=0;
//         int e=nums.length-1;
        
//         while(m<=e)
//         {
//             if(nums[m]==0)
//             {
//                 swap(nums,m,s);
//                 m++;
//                 s++;
//             }
//             else if(nums[m]==1)
//             {
//                 m++;
//             }
//             else
//             {
//                 swap(nums,m,e);
//                 e--;
//             }
//         }
//     }
//     public void swap(int[] num,int a,int b)
//     {
//         int temp=num[a];
//         num[a]=num[b];
//         num[b]=temp;
//     }
// }


class Solution {
    public void sortColors(int[] nums) {
        int a=0;
        int m=0;
        int e=nums.length-1;
        while(m<=e){
            if(nums[m] == 0){
                swap(nums,a,m);
                m++;
                a++;
            }
            else if(nums[m] == 1){
                m++;
            }
            else{
                swap(nums,m,e);
                e--;
            }
        }
    }
    public static void swap(int nums[],int a,int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}