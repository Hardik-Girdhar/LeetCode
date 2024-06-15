class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        int count=1;
        char pre = chars[0];
        
        for(int i=1;i<chars.length;i++){
            char current = chars[i];
            if(pre == chars[i]){
                count++;
            }
            else{
                sb.append(pre);
                if(count>1){
                    sb.append(count);
                }
                pre = current;
                count=1;
            }
        }
        sb.append(pre);
            if(count>1){
                sb.append(count);
            }
        for(int i=0;i<sb.length();i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}


// class Solution {
//     public int compress(char[] chars) {
//         if(chars.length == 1){
//             return 1;
//         }
//         int[] arrc = new int[20];
//         int[] arrn = new int[20];
//         int count=1;
//         for(int i=0;i<chars.length-1;i++){
//             if(chars[i]==chars[i+1]){
//                 count++;
//             }
//             else{
//                 arrc[i]=chars[i];
//                 arrn[i]=count;
//                 count=1;
//             }
//         }
//         int a=0;
//         int b=0;
//         for(int i=0;i<arrc.length;i++){
//             while(arrc[i]!=0){
//                 a++;
//                 b++;
//             }
//         }
//         return a+b;
//     }
// }