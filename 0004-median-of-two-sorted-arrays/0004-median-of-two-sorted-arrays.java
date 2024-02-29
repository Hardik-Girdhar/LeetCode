class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int c= nums1.length + nums2.length;
        // int mid=0;
        int[] nums3 = new int[c];
        System.arraycopy(nums1 , 0 , nums3 , 0 , nums1.length);
        System.arraycopy(nums2 , 0 , nums3 , nums1.length , nums2.length);
        Arrays.sort(nums3);
        int e = nums3.length -1 ;
        int s =0;

        if(nums3.length % 2 == 0)
        {
            // while(s<=e)
            // {
                int mid = s + (e-s)/2;
                return (double)(nums3[mid] + nums3[mid+1])/2;
            // }
        }
        else
        {
            int mid = s + (e-s)/2;
            return (double)nums3[mid];
        }
    }
   
}