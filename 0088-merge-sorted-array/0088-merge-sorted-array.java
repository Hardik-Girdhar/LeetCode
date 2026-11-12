// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         for(int i=0; i<n; i++){
//             nums1[m+i] = nums2[i];
//         }

//         Arrays.sort(nums1);
//     }
// }


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mn = m+n-1;
        int lp = m-1;
        int rp = n-1;

        while(rp >= 0){
            if(lp >= 0 && nums1[lp] > nums2[rp]){
                nums1[mn--] = nums1[lp--];
            }
            else{
                nums1[mn--] = nums2[rp--];
            }
        }
    }
}