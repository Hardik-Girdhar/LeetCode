class Solution {
    public boolean detectCapitalUse(String word) {
        int countcapital = 0;
        for(int i=0;i<word.length() ;i++){
            char ch=word.charAt(i);
            
            if(ch>='A' && ch<='Z'){
                countcapital++;
            }
        }
        
        if(countcapital == 0){
            return true;
        }
        
        if(countcapital == word.length()){
            return true;
        }
        
        if(countcapital == 1 && (word.charAt(0)>='A' && word.charAt(0)<='Z')){
            return true;
        }
           
        return false;
    }
}


// class Solution {
//     public boolean detectCapitalUse(String word) {
//         if(allcapital(word) || allsmall(word) || allsmall(word.substring(1))){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
    
//     public boolean allcapital(String word){
//         for(int i=0;i<word.length() ;i++){
//             char ch = word.charAt(i);
//             if(ch <'A' || ch>'Z'){
//                 return false;
//             }
//         }
//         return true;
//     }
    
//     public boolean allsmall(String word){
//         for(int i=0;i<word.length() ;i++){
//             char ch = word.charAt(i);
//             if(ch<'a' || ch>'z'){
//                 return false;
//             }
//         }
//         return true;
//     }
// }