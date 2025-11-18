class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int continous1 = 0;   // if 1s are even -> true, odd -> false,  if any 0 on left of n-1 = true

        int n = bits.length;

        if(n==1) return true;

        if(bits[n-2] == 0) return true;
        
        for(int i=n-2; i>=0; i--){
            if(bits[i] == 1){
                continous1++;
            }else{
                break;
            }
        }
        if(continous1 % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}


// class Solution {
//     public boolean isOneBitCharacter(int[] bits) {
//         int i=0;
//         int n = bits.length;
//         if(n == 1)return true;
//         while(i < n){
//             if(bits[i] == 1){
//                 i+=2;
//             }else{
//                 i++;
//             }

//             if(i == n-1){
//                 return true;
//             }
//         }
//         return false;
//     }
// }