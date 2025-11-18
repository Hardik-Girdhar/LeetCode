class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        int n = bits.length;
        if(n == 1)return true;
        while(i < n){
            if(bits[i] == 1){
                i+=2;
            }else{
                i++;
            }

            if(i == n-1){
                return true;
            }
        }
        return false;
    }
}