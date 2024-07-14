// class Solution {
//     public String countOfAtoms(String formula) {
//         int n = formula.length();

//         Stack<Map<String,Integer>> st = new Stack<>();
//         st.push(new HashMap<>());

//         int i=0;
//         while(i<n){
//             if(formula.charAt(i) == '('){
//                 st.push(new HashMap<>());
//                 i++;
//             }
//             else if(formula.charAt(i) == ')'){
//                 Map<String,Integer> curr = st.pop();
//                 i++;

//                 StringBuilder sb = new StringBuilder();
//                 while(i<n && Character.isDigit(formula.charAt(i))){
//                     sb.append(formula.charAt(i));
//                     i++;
//                 } 

//                 int multiplier = sb.length() > 0 ? Integer.parseInt(sb.toString()) : 1;
//                 for(String key : curr.keySet()){
//                     int value = curr.get(key);
//                     curr.put(key,value * multiplier);
//                 }

//                 for(String key : curr.keySet()){
//                     st.peek().put(key, st.peek().getOrDefault(key, 0) + curr.get(key));
//                 }
//             }
//             else{
//                 StringBuilder ele = new StringBuilder();
//                 ele.append(formula.charAt(i));
//                 i++;

//                 while(i<n && Character.isLowerCase(formula.charAt(i))){
//                     ele.append(formula.charAt(i));
//                     i++;
//                 }

//                 StringBuilder sb = new StringBuilder();
//                 while(i<n && Character.isDigit(formula.charAt(i))){
//                     sb.append(formula.charAt(i));
//                     i++;
//                 }

//                 int count = sb.length()>0 ? Integer.parseInt(sb.toString()) : 1;

//                 st.peek().put(ele.toString() , st.peek().getOrDefault(ele.toString(),0)+count);
//             }
//         }

//         StringBuilder res = new StringBuilder();
//         TreeMap<String,Integer> sortedMap = new TreeMap<>(st.peek());
//         for(String key : sortedMap.keySet()){
//             res.append(key);
//             int count = sortedMap.get(key);
//             if(count>1){
//                 res.append(count);
//             }
//         } 

//         return res.toString();
//     }
// }


class Solution {
    public String countOfAtoms(String formula) {
        int n=formula.length();
        Stack<Map<String,Integer>> st = new Stack<>();
        st.push(new HashMap<>());

        int i=0;
        while(i<n){
            if(formula.charAt(i) == '('){
                st.push(new HashMap<>());
                i++;
            }
            else if(formula.charAt(i) == ')'){
                Map<String, Integer> curr = st.pop();
                i++;

                StringBuilder sb = new StringBuilder();
                while(i<n && Character.isDigit(formula.charAt(i))){
                    sb.append(formula.charAt(i));
                    i++;
                }

                int number = sb.length() > 0 ? Integer.parseInt(sb.toString()) : 1;
                for(String key : curr.keySet()){
                    int value = curr.get(key);
                    curr.put(key, value*number);
                }

                for(String key : curr.keySet()){
                    st.peek().put(key,st.peek().getOrDefault(key,0)+curr.get(key));
                }
            }
            else{
                StringBuilder ele = new StringBuilder();
                ele.append(formula.charAt(i++));

                while(i<n && Character.isLowerCase(formula.charAt(i))){
                    ele.append(formula.charAt(i++));
                }

                StringBuilder sb = new StringBuilder();
                while(i<n && Character.isDigit(formula.charAt(i))){
                    sb.append(formula.charAt(i++));
                }

                int count = sb.length() > 0 ? Integer.parseInt(sb.toString()) : 1;
                st.peek().put(ele.toString(),st.peek().getOrDefault(ele.toString(),0)+count);
            }
        }

        StringBuilder res = new StringBuilder();
        TreeMap<String,Integer> tree = new TreeMap<>(st.peek());

        for(String key : tree.keySet()){
            res.append(key);
            int value = tree.get(key);
            if(value>1){
                res.append(value);
            }
        }
        return res.toString();
    }
}