// class Solution {
//     public int longestSubarray(int[] nums, int limit) {
//         int ans=0;
//         int i =0;
//         int j=0;
//         PriorityQueue<int[]> maxpq = new PriorityQueue<>((a,b)->b[0]-a[0]);
//         PriorityQueue<int[]> minpq = new PriorityQueue<>((a,b)->a[0]-b[0]);
//         while(j<nums.length){
//             maxpq.add(new int[]{nums[j],j});
//             minpq.add(new int[]{nums[j],j});
//             while(maxpq.peek()[0] - minpq.peek()[0] > limit){
//                 i = Math.min(maxpq.peek()[1] , minpq.peek()[1]) + 1;
//                 while(maxpq.peek()[1]<i){
//                     maxpq.poll();
//                 }
//                 while(minpq.peek()[1]<i){
//                     minpq.poll();
//                 }
//             }
//             ans = Math.max(ans,j-i+1);
//             j++;
//         }
//         return ans;
//     }
// }

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int ans=0;
        TreeMap<Integer, Integer> st = new TreeMap<>();
        int i=0;
        int j=0;
        while(j<nums.length){
            st.put(nums[j],st.getOrDefault(nums[j],0)+1);
            while(st.lastKey() - st.firstKey() > limit){
                st.put(nums[i],st.get(nums[i])-1);
                if(st.get(nums[i]) == 0){
                    st.remove(nums[i]);
                }
                i++;   
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}