// class Solution {
//     public boolean judgeSquareSum(int c) {
//         long left=0;
//         long right = (int)Math.sqrt(c);
//         if(c<0){
//             return false;
//         }
//         while(left <= right){
//             long sum = left*left + right*right;
//             if(sum == c){
//                 return true;
//             }
//             else if(sum < c){
//                 left++;
//             }
//             else{
//                 right--;
//             }
//         }
//         return false;
//     }
// }


class Solution {
    public boolean judgeSquareSum(int c) {
        
        long l=0;
        long r =(int)Math.sqrt(c);
        while(l<=r){
            long sum = l*l + r*r;
            if(sum == c){
                return true;
            }
            else if(sum > c){
                r--;
            }
            else{
                l++;
            }
            
        }
        return false;
    }
}