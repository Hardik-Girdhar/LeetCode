// class Solution {
//     public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
//         int n=profits.length;
//         // 1 - sort pair of element of cap and prof as per the capital 
//         PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->a[1]-b[1]);
        
//         // 2 - make pairs of prof and capital and put it in pq
//         for(int i=0;i<n;i++){
//             pq.add(new int[]{profits[i],capital[i]});
//         }
        
//         // 3 - make maxheap priority queue on the absic of profit- which was been select on              basis of remain capital
//         PriorityQueue<int[]> maxh = new PriorityQueue<int[]>((a,b)->b[0]-a[0]);
        
//         // iterate when k=0
//         while((!pq.isEmpty() || !maxh.isEmpty()) && k>0){
//             if(!pq.isEmpty() && pq.peek()[1] <= w){
//                 maxh.add(pq.poll());
//             }
//             else{
//                 if(!maxh.isEmpty()){
//                     w += maxh.poll()[0];
//                     k--;
//                 }
//                 else{
//                     break;
//                 }
//             }
//         }
//         return w;
//     }
// }


class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[]> maxc = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int i=0;i<profits.length;i++){
            maxc.add(new int[]{profits[i],capital[i]});
        }
        PriorityQueue<int[]>maxp = new PriorityQueue<>((a,b)->b[0]-a[0]);
        
        while((!maxc.isEmpty() || !maxp.isEmpty()) && k>0){
            if(!maxc.isEmpty() && w>=maxc.peek()[1]){
                maxp.add(maxc.poll());
            }
            else{
                if(!maxp.isEmpty()){
                    w += maxp.poll()[0];
                    k--;
                }
                else{
                    break;
                }
            }
        }
        return w;
    }
}