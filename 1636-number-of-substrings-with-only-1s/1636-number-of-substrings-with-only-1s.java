// OPTIMAL APPROACH
class Solution {
    public int numSub(String s) {
        long count = 0;
        long total = 0;
        long mod = 1000000007;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }else{
                count=0;
            }
            total = (total+count)%mod;
        }
        return (int)total;
    }
}


// // BRUTE FORCE
// class Solution {
//     public int numSub(String s) {

//         int count=0;
//         for(int i=0; i<s.length(); i++){
//             if(s.charAt(i) == '1'){
//                 for(int j=i; j<s.length() && s.charAt(j)=='1' ; j++){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }