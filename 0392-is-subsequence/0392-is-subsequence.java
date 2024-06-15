class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;   // for t string
        int j=0;   // for s string
        while(i<t.length()){
            if(j==s.length()){
                break;
            }
            else if(s.charAt(j) == t.charAt(i)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return j==s.length();
    }
}