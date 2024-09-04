class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            int digit = ch - 'a' + 1;
            sb.append(digit);
        }

        while(k>0){
            int sum = 0;
            for(char ch : sb.toString().toCharArray()){
                sum += ch - '0';
            }
            
            sb = new StringBuilder();
            sb.append(sum);
            k--;
        }

        return Integer.parseInt(sb.toString());
    }
}