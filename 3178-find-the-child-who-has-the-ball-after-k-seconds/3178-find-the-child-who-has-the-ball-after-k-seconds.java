class Solution {
    public int numberOfChild(int n, int k) {
        int i=0;
        boolean flag = true;
        while(k>0){
            if(i==n-1){
                flag=false;
            }
            if(i==0){
                flag=true;
            }
            
            if(flag){
                i++;
            }
            else{
                i--;
            }
            k--;
        }
        return i;
    }
}
