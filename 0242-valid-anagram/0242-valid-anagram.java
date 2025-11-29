class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // for(char schar : s){
        //     map.put(schar , map.getOrDefault(schar, 0) + 1);
        // }
        // for(char tchar : t){
        //     map.put(tchar , map.getOrDefault(tchar, 0) + 1);
        // }

        if(s.length() != t.length()) return false;

        // for(int i=0; i<s.length(); i++){
        //     map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        //     map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        // }

        // for(Map.Entry<Character, Integer> entry : map.entrySet()){
        //     if(entry.getValue() % 2 != 0){
        //         return false;
        //     }
        // }

        int[] arr = new int[26];

        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<t.length(); i++){
            arr[t.charAt(i) - 'a']--;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0) return false;
        }

        return true;
    }
}