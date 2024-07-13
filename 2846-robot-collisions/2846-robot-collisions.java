class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<positions.length;i++){
            list.add(i);
        }

        Collections.sort(list,(a,b)->Integer.compare(positions[a],positions[b]));

        Stack<Integer> st = new Stack<>();
        for(var l : list){
            if(directions.charAt(l) == 'L'){
                while(!st.isEmpty()){
                    int temp = st.peek();
                    if(healths[temp] == healths[l]){
                        healths[temp] = 0;
                        healths[l] = 0;
                        st.pop();
                        break;
                    }

                    else if(healths[l] > healths[temp]){
                        healths[l]--;
                        healths[temp] = 0;
                        st.pop();
                    }

                    else{
                        healths[temp]--;
                        healths[l] = 0;
                        break;
                    }
                }
            }
            else{
                st.push(l);
            }
        }

        List<Integer> res = new ArrayList<>();
        for(var h : healths){
            if(h!=0){
                res.add(h);
            }
        }
        return res;
    }
}