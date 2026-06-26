class Solution {
    public boolean backspaceCompare(String s, String t) {
        String r="";
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='#'){
                if (r.length()==0){continue;}
                r=r.substring(0,r.length()-1);
            }
            else{
                r+=s.charAt(i)+"";
            }
        }
        String u="";
        for(int i=0;i<t.length();i++){
            if (t.charAt(i)=='#'){
                if (u.length()==0){continue;}
                u=u.substring(0,u.length()-1);
            }
            else{
                u+=t.charAt(i)+"";
            }
        }

        return u.equals(r);
    }
}