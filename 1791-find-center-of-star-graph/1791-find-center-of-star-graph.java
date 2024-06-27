// // TIME COMPLEXITY - O(n)
// class Solution {
//     public int findCenter(int[][] edges) {
//         Map<Integer,Integer> degree = new HashMap<>();
        
//         for(int[] edge : edges){
//             int u = edge[0];
//             int v = edge[1];
            
//             map.put(u,map.getOrDefault(u,0)+1);
//             map.put(v,map.getOrDefault(v,0)+1);
//          }
//     }
// }


class Solution {
    public int findCenter(int[][] edges) {
        int[] first = edges[0];
        int[] second = edges[1];
        
        if(first[0] == second[0] || first[0] == second[1]){
            return first[0];
        }
        else{
            return first[1];
        }
    }
}

// TIME COMPLEXITY - CONSTANT - O(2) - O(1)
// class Solution {
//     public int findCenter(int[][] edges) {
//         int[] first = edges[0];
//         int[] second = edges[1];
        
//         if(first[0] == second[0] || first[0] == second[1]){
//             return first[0];
//         }
//         else{
//             return first[1];
//         }
//     }
// }