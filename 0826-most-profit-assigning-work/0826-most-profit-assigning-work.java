// //Approach-1 (Using max-heap)
// //T.C : O(nlogn + mlogn)
// //S.C : O(n)
// class Solution {
//     public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
//         int total = 0;
//         PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
// //         O(nlogn)
//         for (int i = 0; i < profit.length; i++) {
//             pq.add(new int[] { profit[i], difficulty[i] });
//         }
// //         O(nlogn)
//         Arrays.sort(worker);
//         int idx = worker.length - 1;
// //         O(m+logn)
//         while (!pq.isEmpty() && idx >= 0) {
//             if (worker[idx] >= pq.peek()[1]) {
//                 total += pq.peek()[0];
//                 idx--;
//             } else {
//                 pq.poll();
//             }
//         }
//         return total;
//     }
// }


// //Approach-2 (Using Binary Search)
// //T.C : O(nlogn)
// //S.C : O(n)
// class Solution {
//     public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {       
//         // make pair in linked list of diffculty and profit
//         List<int[]> list = new ArrayList<>();
//         for(int i=0;i<profit.length;i++){
//             list.add(new int[]{difficulty[i],profit[i]});
//         }
        
//         //sort as per difficulty
//         Collections.sort(list,(a,b)->Integer.compare(a[0],b[0]));
        
//         // take maximum profit at each array
//         for(int i=1;i<list.size()-1;i++){
//             list.get(i)[1] = Math.max(list.get(i-1)[1] , list.get(i)[1]);
//         }
        
//         int total = 0;
//         for(int i=0;i<worker.length;i++){
//             // apply binary search
//             int l=0;
//             int r=list.size()-1;
//             int max = 0;
//             while(l<=r){
//                 int mid = l + (r-l)/2;
//                 if(list.get(mid)[0] <= worker[i]){
//                     max = Math.max(max , list.get(mid)[1]);
//                     l = mid+1;
//                 }
//                 else{
//                     r=mid-1;
//                 }
//             }
//             total += max;
//         }
        
//         return total;
//     }
// }


//Approach-3 (Using simple iteration and sorting)
//T.C : O(nlogn + mlogm + m + n)
//S.C : O(n)
// class Solution {
//     public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
//         int n = difficulty.length;
//         int m = worker.length;

//         // Create an array of pairs to hold difficulty and profit
//         int[][] vec = new int[n][2];
//         for (int i = 0; i < n; i++) {
//             vec[i][0] = difficulty[i];
//             vec[i][1] = profit[i];
//         }

//         // Sort the array based on difficulty
//         Arrays.sort(vec, (a, b) -> Integer.compare(a[0], b[0]));

//         // Sort the worker array
//         Arrays.sort(worker);

//         int totalProfit = 0;
//         int j = 0; // Pointer to vec array
//         int maxProfit = 0;

//         for (int i = 0; i < m; i++) {
//             while (j < n && worker[i] >= vec[j][0]) {
//                 maxProfit = Math.max(maxProfit, vec[j][1]);
//                 j++;
//             }
//             totalProfit += maxProfit;
//         }

//         return totalProfit;
//     }
// }

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int total = 0 ;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<profit.length;i++){
            pq.add(new int[]{profit[i],difficulty[i]});
        }
        
        Arrays.sort(worker);
        int idx = worker.length-1;
        
        while(idx>=0 && !pq.isEmpty()){
            if(worker[idx] >= pq.peek()[1]){
                total += pq.peek()[0];
                idx--;
            }
            else{
                pq.poll();
            }
        }
        return total;
    }
}