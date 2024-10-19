class Solution {
    public char findKthBit(int n, int k) {
        int length = (1<<n) - 1;
        // int length = (int)Math.pow(2,n) - 1;
        int mid = length/2 + 1;

        if(n==1){
            return '0';
        }

        if(k == mid){
            return '1';
        }
        else if(k < mid){
            return findKthBit(n-1 , k);
        }
        else{
            char ch = findKthBit(n-1 , length - (k-1));
            return ch == '0' ? '1' : '0';
        }

    }
}