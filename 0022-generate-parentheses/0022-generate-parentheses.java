class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(list, 0, 0, "", n);
        return list;
    }

    public void generate(List<String> list, int open, int close, String str, int n){
        if(open == n && close == n){
            list.add(str);
            return;
        }

        if(open < n){
            generate(list, open + 1, close, str + "(", n);
        }

        if(open > close){
            generate(list, open, close + 1, str + ")", n);
        }
    }
}