// class Solution {
//     public long maximumImportance(int n, int[][] roads) {
//         long ans=0;
//         int[] degree = new int[n];
//         for(int[] road : roads){
//             int u=road[0];
//             int v=road[1];
            
//             degree[u]++;
//             degree[v]++;
//         }
        
//         Arrays.sort(degree);
//         long value=1;
//         for(int i=0;i<n;i++){
//             ans += (degree[i]*value);
//             value++;
//         }
//         return ans;
//     }
// }

class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] degree = new int[n];
        for(int[] road:roads){
            int u = road[0];
            int v = road[1];
            
            degree[u]++;
            degree[v]++;
        }
        
        Arrays.sort(degree);
        long sum=0;
        long value=1;
        for(int i=0;i<n;i++){
            sum += (degree[i] * value);
            value++;
        }
        return sum;
    }
}