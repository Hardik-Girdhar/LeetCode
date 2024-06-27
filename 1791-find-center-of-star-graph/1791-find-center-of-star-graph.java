// // TIME COMPLEXITY - O(n)
class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> degree = new HashMap<>();
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            
            degree.put(u,degree.getOrDefault(u,0)+1);
            degree.put(v,degree.getOrDefault(v,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : degree.entrySet()){
            if(entry.getValue() == edges.length){
                return entry.getKey();
            }
        }
        return -1;
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