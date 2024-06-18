// class Solution {
//     public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
//         int maxDifficulty = 0;
//         for (int d : difficulty) {
//             maxDifficulty = Math.max(maxDifficulty, d);
//         }

//         int[] maxProfitUpToDifficulty = new int[maxDifficulty + 1];
//         for (int i = 0; i < difficulty.length; i++) {
//             maxProfitUpToDifficulty[difficulty[i]] = Math.max(maxProfitUpToDifficulty[difficulty[i]], profit[i]);
//         }

//         for (int i = 1; i <= maxDifficulty; i++) {
//             maxProfitUpToDifficulty[i] = Math.max(maxProfitUpToDifficulty[i], maxProfitUpToDifficulty[i - 1]);
//         }

//         int totalProfit = 0;
//         for (int ability : worker) {
//             if (ability > maxDifficulty) {
//                 totalProfit += maxProfitUpToDifficulty[maxDifficulty];
//             } else {
//                 totalProfit += maxProfitUpToDifficulty[ability];
//             }
//         }

//         return totalProfit;
//     }

// }

// class Solution {
//     public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
//         int ret = 0;
//         PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]); // Max-heap based on profit
        
//         for (int i = 0; i < profit.length; i++) {
//             pq.offer(new int[]{profit[i], difficulty[i]});
//         }
        
//         Arrays.sort(worker);
//         int workerIndex = worker.length - 1;
        
//         while (!pq.isEmpty() && workerIndex >= 0) {
//             int[] top = pq.peek();
//             while (!pq.isEmpty() && top[1] > worker[workerIndex]) {
//                 pq.poll();
//                 if (!pq.isEmpty()) {
//                     top = pq.peek();
//                 }
//             }
//             if (!pq.isEmpty()) {
//                 ret += top[0];
//                 workerIndex--;
//             }
//         }
        
//         return ret;
//     }
// }


class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int total = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<profit.length;i++){
            pq.add(new int[]{profit[i] , difficulty[i]});
        }
        Arrays.sort(worker);
        int idx = worker.length-1;
        int i=0;
        while(!pq.isEmpty() && idx>=0){
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

// class Solution {
//     public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
//         int n = difficulty.length;
//         int m = worker.length;

//         // Create a max-heap using a priority queue
//         PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]); // Max-heap by profit

//         for (int i = 0; i < n; i++) {
//             int diff = difficulty[i];
//             int prof = profit[i];

//             pq.offer(new int[]{prof, diff});
//         }

//         // Sort worker array in descending order
//         Arrays.sort(worker);
//         for (int i = 0; i < worker.length / 2; i++) {
//             int temp = worker[i];
//             worker[i] = worker[worker.length - 1 - i];
//             worker[worker.length - 1 - i] = temp;
//         }

//         int i = 0;
//         int totalProfit = 0;
//         while (i < m && !pq.isEmpty()) {
//             if (pq.peek()[1] > worker[i]) {
//                 pq.poll();
//             } else {
//                 totalProfit += pq.peek()[0];
//                 i++;
//             }
//         }

//         return totalProfit;
//     }
// }