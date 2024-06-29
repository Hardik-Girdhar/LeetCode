// class Solution {
//     public String reverseWords(String s) {
//         s = s.trim();
//         String rev="";
//         String[] str = s.split(" ");
//         for(int i=str.length-1; i>=0; i--){
//             if(str[i]!=""){
//                 rev=rev+str[i]+" ";
//             }
//             else{
//                 continue;
//             }
//         }
//         return rev.trim();
//     }
// }
class Solution {
    public String reverseWords(String s) {
        String[] strings = s.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = strings.length-1; i >=0 ; i--) {
			sb.append(strings[i]+" ");
		}
		return sb.toString().trim();
    }
}