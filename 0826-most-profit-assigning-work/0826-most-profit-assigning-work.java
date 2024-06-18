// //Approach-1 (Using max-heap)
// //T.C : O(nlogn + mlogn)
// //S.C : O(n)
// class Solution {
//     public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
//         int total = 0;
//         PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
//         for(int i=0;i<profit.length;i++){
//             pq.add(new int[]{profit[i] , difficulty[i]});
//         }
//         Arrays.sort(worker);
//         int idx = worker.length-1;
//         int i=0;
//         while(!pq.isEmpty() && idx>=0){
//             if(worker[idx] >= pq.peek()[1]){
//                 total += pq.peek()[0];
//                 idx--;
//             }
//             else{
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
//         int n = difficulty.length;
//         int m = worker.length;

//         List<int[]> vec = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             vec.add(new int[]{difficulty[i], profit[i]});
//         }

//         // Sort the vector based on difficulty
//         Collections.sort(vec, (a, b) -> Integer.compare(a[0], b[0]));

//         // Pre-processing to find the maximum profit till index i at constant time
//         for (int i = 1; i < vec.size(); i++) {
//             vec.get(i)[1] = Math.max(vec.get(i)[1], vec.get(i - 1)[1]);
//         }

//         int totalProfit = 0;
//         for (int i = 0; i < m; i++) {
//             int workerDiffLevel = worker[i];

//             // Apply binary search on vec
//             int l = 0, r = vec.size() - 1;
//             int maxProfit = 0;
//             while (l <= r) {
//                 int mid = l + (r - l) / 2;
//                 if (vec.get(mid)[0] <= workerDiffLevel) {
//                     maxProfit = Math.max(maxProfit, vec.get(mid)[1]);
//                     l = mid + 1;
//                 } else {
//                     r = mid - 1;
//                 }
//             }

//             totalProfit += maxProfit;
//         }

//         return totalProfit;
//     }
// }


//Approach-3 (Using simple iteration and sorting)
//T.C : O(nlogn + mlogm + m + n)
//S.C : O(n)
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int m = worker.length;

        // Create an array of pairs to hold difficulty and profit
        int[][] vec = new int[n][2];
        for (int i = 0; i < n; i++) {
            vec[i][0] = difficulty[i];
            vec[i][1] = profit[i];
        }

        // Sort the array based on difficulty
        Arrays.sort(vec, (a, b) -> Integer.compare(a[0], b[0]));

        // Sort the worker array
        Arrays.sort(worker);

        int totalProfit = 0;
        int j = 0; // Pointer to vec array
        int maxProfit = 0;

        for (int i = 0; i < m; i++) {
            while (j < n && worker[i] >= vec[j][0]) {
                maxProfit = Math.max(maxProfit, vec[j][1]);
                j++;
            }
            totalProfit += maxProfit;
        }

        return totalProfit;
    }
}