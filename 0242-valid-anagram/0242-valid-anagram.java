// class Solution {
//     public boolean isAnagram(String s, String t) {

//         if(s.length() != t.length()) return false;

//         int[] arr = new int[26];

//         for(int i=0; i<s.length(); i++){
//             arr[s.charAt(i) - 'a']++;
//         }
//         for(int i=0; i<t.length(); i++){
//             arr[t.charAt(i) - 'a']--;
//         }

//         for(int i=0; i<arr.length; i++){
//             if(arr[i] != 0) return false;
//         }

//         return true;
//     }
// }

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        Arrays.sort(sarr);
        Arrays.sort(tarr);

        return Arrays.equals(sarr, tarr);
    }
}