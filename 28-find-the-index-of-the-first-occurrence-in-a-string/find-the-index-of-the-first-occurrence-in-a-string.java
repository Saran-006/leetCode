class Solution {
    public int strStr(String s, String t) {
        // if(s.equals(t)){
        //     return 0;
        // }
        StringBuilder sb=new StringBuilder();
        StringBuilder tsb=new StringBuilder(t);

        for(int i=0;i<s.length()-t.length()+1;i++){
            // System.out.println(s.substring(i,i+t.length()));

            if (sb.length()==0){
                sb.append(s.substring(i,i+t.length()));
            }
            else{
                sb.deleteCharAt(0);
                sb.append(s.charAt(i+t.length()-1));
            }
            System.out.println(sb.toString()+"<==>"+tsb.toString());
            if (sb.compareTo(tsb)==0){
                return i;
            }
        }
        return -1;
    }
}