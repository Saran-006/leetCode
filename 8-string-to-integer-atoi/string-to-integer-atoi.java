class Solution {

    public static int toi(String s){
        System.out.println("s: "+s);
        long res=0L;
        int sign=1;
        for(int i=0;i<s.length();i++){
            if (res>100000000000L){
                break;
            }
            if (s.charAt(i)=='-'){
                sign=-1;
            }
            else if (s.charAt(i)=='+'){
                sign=1;
            }
            else{
                res*=10;
                res+=(int)s.charAt(i)-48;
            }
        }
        res=Math.abs(res);
        System.out.println(res+" "+sign);
        if (sign==-1){res=Math.min((long)Math.pow(2,31),res);}
        if (sign==1){res=Math.min((long)Math.pow(2,31)-1,res);}

        return sign*(int)res;
    }

    public int myAtoi(String s) {
        String r="";
        for(int i=0;i<s.length();i++){
            // System.out.println((int)s.charAt(i));

            if (s.charAt(i)==' ' && r.equals("")){
                continue;
            }
            else if (s.charAt(i)=='-' && r.equals("")){
                r+=s.charAt(i);
            }
            else if (s.charAt(i)=='+' && r.equals("")){
                r+=s.charAt(i);
            }
            else if (((int)s.charAt(i))<=64 && ((int)s.charAt(i))>=48){
                r+=s.charAt(i);
            }
            else{
                break;
            }
        }
        return (r.length()==0)?0:toi(r);
    }
}