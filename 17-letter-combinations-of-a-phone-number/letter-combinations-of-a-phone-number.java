class Solution {
    public String res="";
    public String[] kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public String digits="";
    
    List<String> list=new ArrayList<>();

    void bt(int index){
        

        if(index==digits.length()){
        //  System.out.println(res);
         list.add(res);
         return;
    }
        
        int kpn=Integer.parseInt(""+digits.charAt(index));

        for(int i=0;i<kp[kpn].length();i++){
            res+=(""+kp[kpn].charAt(i));
            bt(index+1);
            res=res.substring(0,res.length()-1);
        }

    }

    public List<String> letterCombinations(String digit) {
    
    digits=digit;
    
    bt(0);

    return list;

    }
}