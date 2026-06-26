class Solution {

    public static int isV(String s){
        String v="aeiouAEIOU";
        int c=0;
        char[] x=s.toCharArray();
        for(char b:x){
            if (v.contains(b+"")){
                c++;
            }
        }
        // System.out.println(s+" "+c);
        return c;
    }

    public int maxVowels(String s, int k) {
        int m=0;
        String v="aeiouAEIOU";
        int x=isV(s.substring(0,k));
        int e=k;
        m=Math.max(m,x);
        for(int i=1;i<s.length()-k+1;i++){
            if (v.contains(s.charAt(i-1)+"")){
                x-=1;
            }
            if (v.contains(s.charAt(e)+"")){
                x+=1;
            }
            
            e++;
            m=Math.max(m,x);
        }

        return m;
        
    }
}