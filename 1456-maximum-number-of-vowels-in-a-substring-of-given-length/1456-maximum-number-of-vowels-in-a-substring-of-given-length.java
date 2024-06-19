class Solution {
    public int maxVowels(String s, int k) {
        int ans=0;
        int i=0;
        int j=0;
        int count=0;
        while(j<s.length()){
            if(isVowel(s.charAt(j))){
                count++;
            }
            // if(j-i+1 < k){
            //     j++;
            // }
            if(j-i+1 == k)
            {
                ans = Math.max(ans,count);
                if(isVowel(s.charAt(i))){
                    count--;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
    public boolean isVowel(char a){
        a=Character.toLowerCase(a);
        return a=='a' || a=='e' || a=='i' || a=='o' || a=='u';
    }
}

// class Solution {
//     public int maxVowels(String s, int k) {
//         int ans=0;
//         int count=0;
//         int i=0;
//         int j=0;
//         while(j<s.length()){
//             if(isVowel(s.charAt(j))){
//                 count++;
//             }
//             if(j-i+1 < k){
// //                 j++;
// //             }
//             if(j-i+1 == k){
//                 ans = Math.max(count,ans);
//                 if(isVowel(s.charAt(i))){
//                     count--;
//                 }
//                 j++;
//                 i++;
//             }
//         }
//         return ans;
//     }
//     public static boolean isVowel(char a){
//         a=Character.toLowerCase(a);
//         return a=='a' || a=='e' || a=='i' || a=='o' || a=='u';
//     }
// }