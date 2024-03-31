class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        
        while(j<t.length())
        {
            if(i==s.length())
            {
                break;
            }
            else if(s.charAt(i) == t.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        
        return i==s.length();
    }
}