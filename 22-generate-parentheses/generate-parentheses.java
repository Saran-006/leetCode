class Solution {

    public List<String> l=new ArrayList<>();
    public int n=0;
    void bt(String s,int o,int c){
        if (o==n && c==n){
            l.add(s);
            return;
        }
        // System.out.println(s);
        if (o<n){
        bt(s+"(",o+1,c);}
        if (c<n && c<o){
        bt(s+")",o,c+1);}
    }

    public List<String> generateParenthesis(int x) {
        n=x;
        bt("(",1,0);
        return l;
    }
}