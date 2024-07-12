// class Solution {
//     public List<String> validStrings(int n) {
//         List<String> list = new ArrayList<>();
//         list.add("1");
//         list.add("0");
//         if(n==1){
//             return list;
//         }
//         for(int i=2;i<=n;i++){
//             List<String> temp = new ArrayList<>();
//             for(String s : list){
//                 temp.add(s+"1");
//                 if(s.charAt(s.length()-1) == '1'){
//                     temp.add(s+"0");
//                 }
//             }
//             list = temp;
//         }
//         return list;
//     }
// }

class Solution {
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        String s = "";
        findBinary(0,n,list,s);
        return list;
    }
    private void findBinary(int start, int n, List<String>list, String s){
        for(int i=start ; i<=n; i++){
            //Base Condition
            if(s.length() == n){
                list.add(s);
                return;
            }

            if(s.length()>0 && s.charAt(s.length()-1) == '0'){
                findBinary(start+1,n,list,s+"1");
                return ;
            }

            else{
                findBinary(start+1,n,list,s+"1");
                findBinary(start+1,n,list,s+"0");
                return;
            }
        }
    }
}