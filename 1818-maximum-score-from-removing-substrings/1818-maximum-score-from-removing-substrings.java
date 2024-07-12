// class Solution {
//     public int maximumGain(String s, int x, int y) {
//         int score = 0;
//         Stack<Character> stba = new Stack<>();
//         Stack<Character> stab = new Stack<>();
//         int i=0;
//         while(i<s.length()){
//             if(s.charAt(i) == 'a'){
//                 if(!stba.isEmpty() && stba.peek()=='b'){
//                     score += y;
//                     stba.pop();
//                 }
//                 else{
//                     stba.push(s.charAt(i));
//                 }
//             }
//             else{
//                 stba.push(s.charAt(i));
//             }
//             i++;
//         }

//         while(!stba.isEmpty()){
//             char top = stba.pop();
//             if(top == 'a'){
//                 if(!stab.isEmpty() && stab.peek() =='b'){
//                     score += x;
//                     stab.pop();
//                 }
//                 else{
//                     stab.push(top);
//                 }
//             }
//             else{
//                 stab.push(top);
//             }
//         }
//         return score;
//     }
// }

class Solution {
    public int maximumGain(String s, int x, int y) {
        int score = 0;
        if(x>=y){
            score += removePairs(s,'a','b',x);       // score of ab
            s = removeString(s,'a','b');
            score += removePairs(s,'b','a',y);       // score of ba
        }
        else{
            score += removePairs(s,'b','a',y);       // score of ba
            s = removeString(s,'b','a');
            score += removePairs(s,'a','b',x);       // score of ab
        }
        return score;
    }

    private int removePairs(String s, char first, char sec, int gain){
        int score = 0;
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && st.peek() == first && c== sec){
                st.pop();
                score += gain;
            }
            else{
                st.push(c);
            }
        }
        return score;
    }

    private String removeString(String s, char first, char sec){
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && st.peek() == first && c== sec){
                st.pop();
            }
            else{
                st.push(c);
            }
        }

        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }

        return sb.toString();
    }
}
