class Solution {
    public String reverseWords(String s) {
        String x="";
       String[] arr=s.strip().split(" ");
       for(int i=arr.length-1;i>=0;i--){
        if (arr[i]==""){continue;}
        x+=arr[i].strip();
        // System.out.println(arr[i]+".");
        x+=" ";
       } 
       return x.strip();
    }
}