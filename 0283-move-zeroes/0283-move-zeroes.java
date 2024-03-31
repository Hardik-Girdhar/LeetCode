// class Solution {
//     public void moveZeroes(int[] nums) {
//         int j=-1;
//         for(int i=0;j<nums.length;j++)
//         {
//             if(nums[i]==0)
//             {
//                 j=i;
//                 break;
//             }
//         }
//         if(j==-1)
//         {
//             return ;
//         }
//         for(int i = j+1;i<nums.length;i++)
//         {
//             if(nums[i]!=0)
//             {
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j]=temp;
//                 j++;
//             }
//         }
//     }
// }
class Solution {
    public void moveZeroes(int[] nums) {
        int j=-1;
        for(int i = 0 ; i <nums.length ; i++)
        {
            if(nums[i] == 0)
            {
                j=i;
                break;
            }
        }
        if(j==-1)
        {
            return;
        }
        for(int i=j+1 ; i<nums.length ; i++)
        {
            if(nums[i] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}