class Solution {
    public int myAtoi(String s) {
        int si=0,l=s.length(),flag=Integer.MAX_VALUE/10;
        boolean neg=false,range=false,sign=false,dig=false;
        first:for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if((sign==true)&&(ch<48 || ch>57))
                break;
            if((ch<48 || ch>57)&&(ch!=43 && ch!=45 && ch!=32))
                break; 
            else if(ch>=48 && ch<=57){
                dig=true;
                if((si > flag) || (si == flag && ch > '7')){
                    range=true;
                    break;
                }
                int a=ch-'0';
                si=si*10+a;
            }
            else{
                switch(ch){
                    case '-':
                        if(dig==true)
                            break first;
                        else if(sign==false){
                            sign=true;
                            neg=true;
                        }
                        else
                            return 0;
                        break;
                    case '+':
                        if(dig==true)
                            break first;
                        else if(sign==false)
                            sign=true;
                        else 
                            return 0;
                        break;
                    case ' ':
                        if(dig==true)
                            break first;
                        break;
                    default:
                        break first;
                }
            }
        }
        if(neg==false && range==false)
            return si;
        else if(neg==false && range==true)
            return Integer.MAX_VALUE;
        else if(neg==true && range==false)
            return si*(-1);
        else
            return Integer.MIN_VALUE;
    }
}