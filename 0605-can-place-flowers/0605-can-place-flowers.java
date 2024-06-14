/*
    if all are zero = (c+1)/2
    initial and final are zeros = c/2
    inbetween zeros of 1 = (c-1)/2
*/

// class Solution {
//     public boolean canPlaceFlowers(int[] arr, int n) {
//         int max=0;
//         if(n==0){
//             return true;
//         }
        
//         int li=-1;
//         int ri=-1;
        
//         for(int i=0;i<arr.length;i++){
//             if(arr[i] == 0){
//                 continue;
//             }
//             else if(l1==-1){
//                 l1 = i;
//                 ri = i;
//             }
//             else{
//                 ri=i;
//             }
//         }
        
//         // if all are zeros
//         if(li==-1){
            
//         }
//         return n <= max;
//     }
// }


class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        if(n==0){
            return true;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0 && (i==0 || arr[i-1]==0) && (i==arr.length-1 || arr[i+1]==0)){
                arr[i]=1;
                n--;
                
                if(n==0){
                    return true;
                }
            }
        }
        return false;
    }
}