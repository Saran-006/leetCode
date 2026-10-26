class Solution {

    public String rle(String s){
        StringBuilder r=new StringBuilder();
        int c=0;
        char prev=s.charAt(0);

        for(int i=0;i<s.length();i++){
            if (s.charAt(i)==prev){
                c++;
            }
            else{
                r.append(c);
                r.append(prev);
                c=1;
                prev=s.charAt(i);
            }
        }
        
        r.append(c);
        r.append(prev);

        return r.toString();
    }

    public String countAndSay(int n) {
        String r="1";

        for(int i=1;i<n;i++){
            r=rle(r);
        }

        return r;
    }
}