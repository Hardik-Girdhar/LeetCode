class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(!isVowel(arr[left])){
                left++;
            }
            else if(!isVowel(arr[right])){
                right--;
            }
            else{
                swap(arr , left , right);
                left++;
                right--;
            }
        }
        // return arr.toString();
        return new String(arr);
    }
    public static void swap(char[] arr , int a, int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static boolean isVowel(char a){
        a = Character.toLowerCase(a);
        return a=='a' || a=='e' || a=='i' || a=='o' || a=='u';
    }
}