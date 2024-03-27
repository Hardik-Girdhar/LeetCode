class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        
        int a = word1.length();
        int b = word2.length();
        int i=0;
        int j=0;
        boolean flag = true;
        while(i<a && j<b)
        {
            if(flag)
            {
                sb.append(word1.charAt(i));
                i++;
            }
            else
            {
                sb.append(word2.charAt(j));
                j++;
            }
            flag = !flag;
        }
        while(i<a)
        {
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<b)
        {
            sb.append(word2.charAt(j));
            j++;
        }
        
        return sb.toString();
    }
}


// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//         int a=word1.length();
//         int b=word2.length();
//         String s="";
//         int n = Math.min(a,b);
//         for(int i =0;i<n;i++)
//         {
//             s = s+word1.charAt(i);
//             s = s+word2.charAt(i);
//         }
//         if(a>b)
//         {
//             for(int i=n;i<a;i++)
//                 {
//                     s = s+word1.charAt(i);
//                 }
//         }
//         else
//         {
//             for(int i=n;i<b;i++)
//                 {
//                     s = s+word2.charAt(i);
//                 }
//         }
//         return s;
//     }
// }