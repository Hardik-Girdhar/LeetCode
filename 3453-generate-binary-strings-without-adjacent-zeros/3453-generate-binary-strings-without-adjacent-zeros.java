class Solution {
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("0");
        if(n==1){
            return list;
        }
        for(int i=2;i<=n;i++){
            List<String> temp = new ArrayList<>();
            for(String s : list){
                temp.add(s+"1");
                if(s.charAt(s.length()-1) == '1'){
                    temp.add(s+"0");
                }
            }
            list = temp;
        }
        return list;
    }
}