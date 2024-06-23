// class Solution {
//     public int longestSubarray(int[] nums, int limit) {
        
//         LinkedList<Integer> increase = new LinkedList<>();
//         LinkedList<Integer> decrease = new LinkedList<>();

//         int max = 0;
//         int left = 0;

//         for (int i = 0; i < nums.length; i++) {
//             int n = nums[i];

//             while (increase.size() > 0 && n < increase.getLast()) {
//                 increase.removeLast();
//             }
//             increase.add(n);

//             while (decrease.size() > 0 && n > decrease.getLast()) {
//                 decrease.removeLast();
//             }

//             decrease.add(n);

//             while (decrease.getFirst() - increase.getFirst() > limit) {
//                 if (nums[left] == decrease.getFirst()) {
//                     decrease.removeFirst();
//                 }
//                 if (nums[left] == increase.getFirst()) {
//                     increase.removeFirst();
//                 }
//                 left++;
//             }

//             int size = i - left + 1;
//             max = Math.max(max, size);
//         }

//         return max;
//     }
// }


// class Solution {
//     public int longestSubarray(int[] nums, int limit) {
//         int ans = 0;
//         int max = 0;
//         int i=0;
//         int j=0;
//         while(j<nums.length){
//             if(Math.abs(nums[j]-nums[i])<=limit){
//                 max = j-i+1;
//                 ans = Math.max(ans,max);
//                 j++;
//             }
//             else{
//                 i++;
//                 j=i+1;
//             }
//             // j++;
//         }
//         return ans;
//     }
// }

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int ans=0;
        int i =0;
        int j=0;
        PriorityQueue<int[]> maxpq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        PriorityQueue<int[]> minpq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        while(j<nums.length){
            maxpq.add(new int[]{nums[j],j});
            minpq.add(new int[]{nums[j],j});
            while(maxpq.peek()[0] - minpq.peek()[0] > limit){
                i = Math.min(maxpq.peek()[1] , minpq.peek()[1]) + 1;
                while(maxpq.peek()[1]<i){
                    maxpq.poll();
                }
                while(minpq.peek()[1]<i){
                    minpq.poll();
                }
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}