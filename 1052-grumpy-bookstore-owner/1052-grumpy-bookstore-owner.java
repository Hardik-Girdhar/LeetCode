// SLINDING WINDOW PROBLEM
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int ans=0;
        int i=0;
        int j=0;
        int unsatisfy = 0;
        while(j<customers.length){
            if(grumpy[j] == 1){
                unsatisfy += customers[j];
            }
            
            if(j-i+1==minutes){
                ans =Math.max(ans,unsatisfy);
                if(grumpy[i] == 1){
                unsatisfy = unsatisfy - customers[i];
                }
                i++;
            }
            j++;
        }
        for(int h=0;h<customers.length ; h++){
            if(grumpy[h] == 0){
                ans+=customers[h];
            }
        }
        return ans;
    }
}


// class Solution {
//     public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
//         int ans = 0 ;
//         for(int i=customers.length-1;i>=customers.length - minutes; i--){
//             ans+=customers[i];
//         }
//         for(int i=0; i < customers.length - minutes ; i++){
//             if(grumpy[i] == 0){
//                 ans+=customers[i];
//             }
            
//         }
        
//         return ans;
//     }
// }