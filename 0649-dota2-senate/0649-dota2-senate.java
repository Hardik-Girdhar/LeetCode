// /*
//     1) Store count of R and D
//     2) idx=0
//     3) if 'R' -> Remove nearest 'D' towards Right - can take another round from start
//     4) if 'D' -> Remove nearest 'R' towards Right - can take another round from start
//     5) Remember:
//         -> idx-- to be done when we remove element at any index < idx (on left side)
//         -> (idx+1) % n to be done for managing round direction
// */

/* BRUTE FORCE */
// class Solution {
//     public String predictPartyVictory(String senate) {
//         int countR = 0;
//         int countD = 0;

//         for (char ch : senate.toCharArray()) {
//             if (ch == 'R') {
//                 countR++;
//             } else {
//                 countD++;
//             }
//         }

//         StringBuilder sb = new StringBuilder(senate);
//         int idx = 0;

//         while(countR > 0 && countD > 0){
//             if(sb.charAt(idx) == 'R'){
//                 boolean removalLeft = removeCharacter(sb, 'D', (idx+1)%sb.length());
//                 countD--;
//                 if(removalLeft){
//                     idx--;
//                 }
//             }
//             else{
//                 boolean removalLeft = removeCharacter(sb, 'R', (idx+1)%sb.length());
//                 countR--;
//                 if(removalLeft){
//                     idx--;
//                 }
//             }
//             idx = (idx+1)%sb.length();
//         }
//         return countR == 0 ? "Dire" : "Radiant";
//     }

//     private boolean removeCharacter(StringBuilder sb , char ch, int idx){
//         boolean loopAroundleft = false;
//         while(true){
//             if(idx == 0){
//                 loopAroundleft = true;
//             }

//             if(sb.charAt(idx) == ch){
//                 sb.deleteCharAt(idx);
//                 break;
//             }

//             idx = (idx+1)%sb.length();
//         }

//         return loopAroundleft;
//     }
// }

/* OPTIMAL BRUTE using boolean array without idx-- */
class Solution {
    public String predictPartyVictory(String senate) {
        int countR = 0;
        int countD = 0;

        for (char ch : senate.toCharArray()) {
            if (ch == 'R') {
                countR++;
            } else {
                countD++;
            }
        }

        boolean[] removed = new boolean[senate.length()];
        int idx = 0;

        while (countR > 0 && countD > 0) {
            if (!removed[idx]) {
                if (senate.charAt(idx) == 'R') {
                    removeCharacter(senate, 'D', (idx+1)%senate.length(),removed);
                    countD--;
                } else {
                    removeCharacter(senate, 'R', (idx+1)%senate.length(),removed);
                    countR--;
                }
            }
            idx = (idx+1)%senate.length();
        }
        return countR == 0 ? "Dire" : "Radiant";
    }

    private void removeCharacter(String senate, char ch, int idx,boolean[] removed){
        while(true){
            if(senate.charAt(idx) == ch && !removed[idx]){
                removed[idx] = true;
                break;
            }
            idx = (idx+1)%senate.length();
        }
    }
}