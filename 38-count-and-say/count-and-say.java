class Solution {

    public String rle(String s){
        String r="";
        int c=0;
        char prev=s.charAt(0);

        for(int i=0;i<s.length();i++){
            if (s.charAt(i)==prev){
                c++;
            }
            else{
                r=r+c+prev;
                c=1;
                prev=s.charAt(i);
            }
        }
        
        r=r+c+prev;

        return r;
    }

    public String countAndSay(int n) {
        String r="1";

        for(int i=1;i<n;i++){
            r=rle(r);
        }

        return r;
    }
}