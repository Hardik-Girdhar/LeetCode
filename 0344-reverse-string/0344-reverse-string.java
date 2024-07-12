class Solution {
    public void reverseString(char[] s) {
        // char[] copy = Arrays.copyOf(s,s.length);
        // for(int i=0;i<s.length;i++){
        //     s[i] = copy[s.length-1-i];
        // }

        int i=0;
        int j=s.length-1;
        while(i<j){
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}