class Solution {
    public char findKthBit(int n, int k) {

        if(n == 1){
            return '0';
        }

        int length = (1<<n) - 1;  // pow(2,n) - 1

        int mid = length/2 + 1;
        if(k == mid){
            return '1';
        }
        else if(k < mid){
            return findKthBit(n-1,k);
        }
        else{
            char ch = findKthBit(n-1 , length-(k-1));
            return (ch =='0') ? '1' : '0';
        }
    }
}