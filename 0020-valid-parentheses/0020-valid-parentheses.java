// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> st = new Stack<>();
//         for(int i=0;i<s.length();i++)
//         {
//             char c = s.charAt(i);
//             if(c=='(' || c=='{' || c=='[')
//             {
//                 st.push(c);
//             }
//             else
//             {
//                 if(st.isEmpty())
//                 {
//                     return false;
//                 }
//                 else if(c==')' && st.peek() !='(') return false;
//                 else if(c==']' && st.peek() !='[') return false;
//                 else if(c=='}' && st.peek() !='{') return false;
//                 st.pop();
//             }
//         }
//         return st.isEmpty();
//     }
// }

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                st.push(')');
            }
            else if(c=='{')
            {
                st.push('}');
            }
            else if(c=='[')
                
            {
                st.push(']');
            }
            else if(st.isEmpty() || st.pop() != c)
            {
                return false;
            }
        }
        return st.isEmpty();
    }
}