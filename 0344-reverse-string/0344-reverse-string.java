class Solution {
    public void reverseString(char[] s) {
        char[] copy = Arrays.copyOf(s,s.length);
        for(int i=0;i<s.length;i++){
            s[i] = copy[s.length-1-i];
        }
    }
}