class Solution {

    public static List<List<Integer>> result=new ArrayList<>();

    public static List<Integer> res=new ArrayList<>();

    public static int[] visited;

    public static int c=0;

    public static void bt(int[] arr,int n){
        if (n==arr.length){
        System.out.print(res);
        if (res.size()==arr.length && !result.contains(res)){
            result.add(new ArrayList<>(res));
        }
            return;
        }

        for(int i=0;i<visited.length;i++){
            if (visited[i]!=1){
                res.add(arr[i]);
                visited[i]=1;
                bt(arr,n+1);
                res.remove(res.size()-1);
                visited[i]=0;
            }
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        result.clear();

        visited = new int[nums.length];
        bt(nums,0);

        return result;
    }
}