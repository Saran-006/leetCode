class Solution {
    public int[] twoSum(int[] nums, int target) {
        System.gc();
        Map<Integer,Integer> s=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
            s.put(nums[i],i);
            
        }
        System.out.println(s);
        for(int i=0;i<nums.length;i++){
            if(s.containsKey(nums[i])){
                int index=i;
                if (s.containsKey(target-nums[i])){
                index=s.get(target-nums[i]);
                }
                if(i==index)continue;
                if (i<index){
                return new int[]{i,index};
                }
                return new int[]{index,i};

            }
        }

        return new int[]{};
    }
}