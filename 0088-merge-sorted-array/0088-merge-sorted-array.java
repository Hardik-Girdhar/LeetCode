class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nm = n+m-1;
        int lp = m-1;
        int rp = n-1;

        while(rp >= 0){
            if(lp >= 0 && nums1[lp] > nums2[rp]){
                nums1[nm--] = nums1[lp--];
            }
            else{
                nums1[nm--] = nums2[rp--];
            }
        }
    }
}