// class Solution {
//     public long maximumImportance(int n, int[][] roads) {
//          int[] degree = new int[n]; // Array to store the degree of each city
        
//         // Calculate the degree of each city
//         for (int[] road : roads) {
//             degree[road[0]]++;
//             degree[road[1]]++;
//         }
        
//         // Count the frequency of each degree
//         int[] frequency = new int[n];
//         for (int d : degree) {
//             frequency[d]++;
//         }
        
//         long totalImportance = 0;
//         long value = 1;
        
//         // Assign values to cities starting from the highest degree
//         for (long i = 0; i <n; i++) {
//             for (int j = 0; j < frequency[(int)i]; j++) {
//                 totalImportance += i * value++;
//             }
//         }
        
//         return totalImportance;
//     }
// }


class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long ans=0;
        int[] degree = new int[n];
        for(int[] road : roads){
            int u=road[0];
            int v=road[1];
            
            degree[u]++;
            degree[v]++;
        }
        
        Arrays.sort(degree);
        long value=1;
        for(int i=0;i<n;i++){
            ans += (degree[i]*value);
            value++;
        }
        return ans;
    }
}