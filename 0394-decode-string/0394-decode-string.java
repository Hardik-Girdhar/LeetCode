// class Solution {
//     public String decodeString(String s) {
//         Stack<Character> st = new Stack<>();
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i) == ']'){
//                 StringBuilder sb = new StringBuilder();
//                 while(!st.isEmpty() && st.peek()!='['){
//                     sb.insert(0,st.pop());
//                 }
//                 st.pop();
//                 StringBuilder nums = new StringBuilder();
//                 while(!st.isEmpty() && Character.isDigit(st.peek())){
//                     nums.insert(0,st.pop());
//                 }
//                 int number = Integer.parseInt(nums.toString());
//                 StringBuilder repeat = new StringBuilder();
//                 for(int j=0;j<number;j++){
//                     repeat.append(sb);
//                 }
//                 for(int k=0;k<repeat.length();k++){
//                     st.push(repeat.charAt(k));
//                 }
                
//             }
//             else{
//                 st.push(s.charAt(i));
//             }
//         }
//         StringBuilder res= new StringBuilder();
//         while(!st.isEmpty()){
//             res.insert(0,st.pop());
//         }
//         return res.toString();
//     }
// }


class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ']'){
                StringBuilder ch = new StringBuilder();
                while(!st.isEmpty() && st.peek()!='['){
                    ch.insert(0,st.pop());
                }
                st.pop();

                StringBuilder number = new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    number.insert(0,st.pop());
                }

                int nums = Integer.parseInt(number.toString());

                StringBuilder repeat = new StringBuilder();
                for(int j=0;j<nums;j++){
                    repeat.append(ch);
                }

                for(int j=0;j<repeat.length() ; j++){
                    st.push(repeat.charAt(j));
                }
            }
            else{
                st.push(s.charAt(i));
            }
        }

        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.insert(0,st.pop());
        }
        return res.toString();
    }
}