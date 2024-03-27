class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a=word1.length();
        int b=word2.length();
        String s="";
        int n = Math.min(a,b);
        for(int i =0;i<n;i++)
        {
            s = s+word1.charAt(i);
            s = s+word2.charAt(i);
        }
        if(a>b)
        {
            for(int i=n;i<a;i++)
                {
                    s = s+word1.charAt(i);
                }
        }
        else
        {
            for(int i=n;i<b;i++)
                {
                    s = s+word2.charAt(i);
                }
        }
        return s;
    }
}