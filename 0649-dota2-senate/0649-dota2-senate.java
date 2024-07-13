// /*
//     1) Store count of R and D
//     2) idx=0
//     3) if 'R' -> Remove nearest 'D' towards Right - can take another round from start
//     4) if 'D' -> Remove nearest 'R' towards Right - can take another round from start
//     5) Remember:
//         -> idx-- to be done when we remove element at any index < idx (on left side)
//         -> (idx+1) % n to be done for managing round direction
// */


class Solution {
    public String predictPartyVictory(String senate) {
        int R_Count = 0;
        int D_Count = 0;
        
        // Count initial 'R' and 'D'
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                R_Count++;
            } else if (senate.charAt(i) == 'D') {
                D_Count++;
            }
        }

        StringBuilder senateBuilder = new StringBuilder(senate);
        int idx = 0;

        // Simulate the rounds
        while (R_Count > 0 && D_Count > 0) {
            if (senateBuilder.charAt(idx) == 'R') {
                boolean checkRemoval = removeSenator(senateBuilder, 'D', (idx + 1) % senateBuilder.length());
                D_Count--;

                if (checkRemoval) {
                    idx--;
                }
            } else if (senateBuilder.charAt(idx) == 'D') {
                boolean checkRemoval = removeSenator(senateBuilder, 'R', (idx + 1) % senateBuilder.length());
                R_Count--;

                if (checkRemoval) {
                    idx--;
                }
            }

            idx = (idx + 1) % senateBuilder.length();
        }

        return R_Count == 0 ? "Dire" : "Radiant";
    }

    public boolean removeSenator(StringBuilder senate, char ch, int startIdx) {
        boolean loopAround = false;
        int n = senate.length();

        for (int i = startIdx; i < startIdx + n; i++) {
            int idx = i % n;
            if (idx == 0) {
                loopAround = true;
            }
            if (senate.charAt(idx) == ch) {
                senate.deleteCharAt(idx);
                break;
            }
        }

        return loopAround;
    }
}
