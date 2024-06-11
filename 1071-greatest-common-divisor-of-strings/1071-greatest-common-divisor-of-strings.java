class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int a=str1.length();
        int b=str2.length();
        int gcd=gcd(a,b);
        return str1.substring(0,gcd);
    }
    static int gcd(int a,int b){
        while(a%b != 0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        return b;
    }
}


// class Solution {
//     public String gcdOfStrings(String str1, String str2) {
//         if(!(str1+str2).equals(str2+str1)){
//             return "";
//         }
//         HashSet<Character> set = new HashSet<>();
//         for(int i=0;i<str2.length();i++){
//             set.add(str2.charAt(i));
//         }
//         StringBuilder str = new StringBuilder();
//         for(char ele:set){
//             str.append(ele);
//         }
//         return str.toString();
//     }
// }