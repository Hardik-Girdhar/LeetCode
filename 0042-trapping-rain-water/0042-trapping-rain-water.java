class Solution {
    public int trap(int[] height) {
        int water = 0;
        int left[] = prefix(height);
        int right[] = suffix(height);

        for(int i=0; i<height.length; i++){
            int lmax = left[i];
            int rmax = right[i];

            water += Math.min(lmax, rmax) - height[i];
        }

        return water;
    }

    public int[] prefix(int[] ht){
        int n = ht.length;
        int[] pref = new int[n];
        pref[0] = ht[0];

        for(int i=1; i<n; i++){
            pref[i] = Math.max(pref[i-1], ht[i]);
        }

        return pref;
    }

    public int[] suffix(int[] ht){
        int n = ht.length;
        int[] suff = new int[n];
        suff[n-1] = ht[n-1];

        for(int i=n-2; i>=0; i--){
            suff[i] = Math.max(suff[i+1], ht[i]);
        }

        return suff;
    }
}