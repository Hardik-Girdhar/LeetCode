class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int length = Math.min(height[l],height[r]);
            int breadth = r-l;
            int curr = length * breadth;
            max = Math.max(max,curr);
            if(height[l]<=height[r])
            {
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}
