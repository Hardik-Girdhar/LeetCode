class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int curr=0;
        int max=0;
        while(i<=j)
        {
            curr=(j-i)*(Math.min(height[i],height[j]));
            max=Math.max(curr,max);
            if(height[i]>height[j])
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return max;
    }
}