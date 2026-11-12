class Solution {
    public int trap(int[] height) {
        int water = 0;
        int n = height.length;

        int[] left = prefix(height);
        int[] right = suffix(height);

        for(int i=0; i<n; i++){
            int lmax = left[i];
            int rmax = right[i];

            water += Math.min(lmax, rmax) - height[i];
        }

        return water;
    }

    public int[] prefix(int[] height){
        int n = height.length;
        int[] pref = new int[n];

        pref[0] = height[0];
        for(int i=1; i<n; i++){
            pref[i] = Math.max(pref[i-1], height[i]);
        }

        return pref;
    }

    public int[] suffix(int[] height){
        int n = height.length;
        int[] suff = new int[n];

        suff[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            suff[i] = Math.max(suff[i+1], height[i]);
        }

        return suff;
    }
}