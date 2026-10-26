class Solution {
    public int strStr(String s, String t) {
        // if(s.equals(t)){
        //     return 0;
        // }
        for(int i=0;i<s.length()-t.length()+1;i++){
            System.out.println(s.substring(i,i+t.length()));
            if (s.substring(i,i+t.length()).equals(t)){
                return i;
            }
        }
        return -1;
    }
}