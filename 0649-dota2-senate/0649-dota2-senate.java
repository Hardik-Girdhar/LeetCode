// /*
//     1) Store count of R and D
//     2) idx=0
//     3) if 'R' -> Remove nearest 'D' towards Right - can take another round from start
//     4) if 'D' -> Remove nearest 'R' towards Right - can take another round from start
//     5) Remember:
//         -> idx-- to be done when we remove element at any index < idx (on left side)
//         -> (idx+1) % n to be done for managing round direction
// */

// class Solution {
//     public String predictPartyVictory(String senate) {
//         int R_Count = 0;
//         int D_Count = 0;

//         // Count initial 'R' and 'D'
//         for (int i = 0; i < senate.length(); i++) {
//             if (senate.charAt(i) == 'R') {
//                 R_Count++;
//             } else if (senate.charAt(i) == 'D') {
//                 D_Count++;
//             }
//         }

//         StringBuilder senateBuilder = new StringBuilder(senate);
//         int idx = 0;

//         // Simulate the rounds
//         while (R_Count > 0 && D_Count > 0) {
//             if (senateBuilder.charAt(idx) == 'R') {
//                 boolean checkRemoval = removeSenator(senateBuilder, 'D', (idx + 1) % senateBuilder.length());
//                 D_Count--;

//                 if (checkRemoval) {
//                     idx--;
//                 }
//             } else if (senateBuilder.charAt(idx) == 'D') {
//                 boolean checkRemoval = removeSenator(senateBuilder, 'R', (idx + 1) % senateBuilder.length());
//                 R_Count--;

//                 if (checkRemoval) {
//                     idx--;
//                 }
//             }

//             idx = (idx + 1) % senateBuilder.length();
//         }

//         return R_Count == 0 ? "Dire" : "Radiant";
//     }

//     public boolean removeSenator(StringBuilder senate, char ch, int startIdx) {
//         boolean loopAround = false;
//         int n = senate.length();

//         for (int i = startIdx; i < startIdx + n; i++) {
//             int idx = i % n;
//             if (idx == 0) {
//                 loopAround = true;
//             }
//             if (senate.charAt(idx) == ch) {
//                 senate.deleteCharAt(idx);
//                 break;
//             }
//         }

//         return loopAround;
//     }
// }

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

        StringBuilder sb = new StringBuilder(senate);
        int idx = 0;
        
        while(countR > 0 && countD > 0){
            if(sb.charAt(idx) == 'R'){
                boolean removalLeft = removeCharacter(sb, 'D', (idx+1)%sb.length());
                countD--;
                if(removalLeft){
                    idx--;
                }
            }
            else{
                boolean removalLeft = removeCharacter(sb, 'R', (idx+1)%sb.length());
                countR--;
                if(removalLeft){
                    idx--;
                }
            }
            idx = (idx+1)%sb.length();
        }
        return countR == 0 ? "Dire" : "Radiant";
    }

    private boolean removeCharacter(StringBuilder sb , char ch, int idx){
        boolean loopAroundleft = false;
        while(true){
            if(idx == 0){
                loopAroundleft = true;
            }

            if(sb.charAt(idx) == ch){
                sb.deleteCharAt(idx);
                break;
            }

            idx = (idx+1)%sb.length();
        }

        return loopAroundleft;
    }
}