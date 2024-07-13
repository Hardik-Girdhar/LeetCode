// class Solution {
//     public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
//         List<Integer> list = new ArrayList<>();
//         for(int i=0;i<positions.length;i++){
//             list.add(i);
//         }

//         Collections.sort(list,(a,b)->Integer.compare(positions[a],positions[b]));

//         Stack<Integer> st = new Stack<>();
//         for(var l : list){
//             if(directions.charAt(l) == 'L'){
//                 while(!st.isEmpty()){
//                     int temp = st.peek();
//                     if(healths[temp] == healths[l]){
//                         healths[temp] = 0;
//                         healths[l] = 0;
//                         st.pop();
//                         break;
//                     }

//                     else if(healths[l] > healths[temp]){
//                         healths[l]--;
//                         healths[temp] = 0;
//                         st.pop();
//                     }

//                     else{
//                         healths[temp]--;
//                         healths[l] = 0;
//                         break;
//                     }
//                 }
//             }
//             else{
//                 st.push(l);
//             }
//         }

//         List<Integer> res = new ArrayList<>();
//         for(int h : healths){
//             if(h!=0){
//                 res.add(h);
//             }
//         }
//         return res;
//     }
// }


class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) indices[i] = i;
        
        // Sort indices based on positions
        Arrays.sort(indices, (a, b) -> Integer.compare(positions[a], positions[b]));
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i : indices) {
            if (directions.charAt(i) == 'R') {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && healths[i] > 0) {
                    int j = stack.peek();
                    if (healths[i] < healths[j]) {
                        healths[j]--;
                        healths[i] = 0;
                    } else if (healths[i] > healths[j]) {
                        healths[i]--;
                        healths[j] = 0;
                        stack.pop();
                    } else {
                        healths[i] = healths[j] = 0;
                        stack.pop();
                        break;
                    }
                }
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        for (int h : healths) {
            if (h > 0) ans.add(h);
        }
        return ans;
    }
}