class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch) == 0) map.remove(ch);
                // if(map.get(ch) == 1){
                //     map.remove(ch);
                // }else{
                //     map.put(ch, map.get(ch)-1);
                // }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
}

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

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         char[] sarr = s.toCharArray();
//         char[] tarr = t.toCharArray();

//         Arrays.sort(sarr);
//         Arrays.sort(tarr);

//         return Arrays.equals(sarr, tarr);
//     }
// }