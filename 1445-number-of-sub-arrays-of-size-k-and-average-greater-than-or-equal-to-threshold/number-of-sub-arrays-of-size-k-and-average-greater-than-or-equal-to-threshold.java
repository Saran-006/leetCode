class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c=0;
        int s=0;
        System.out.println("len: "+arr.length);
        for(int i=0;i<k;i++){
            s+=arr[i];
        }
        
        if (s/k>=threshold){c++;}
        for(int i=1;i<arr.length-k+1;i++){
            s-=arr[i-1];
            s+=arr[i+k-1];
            System.out.println(i+" "+(i+k-1)+" "+(float)s/k);
            if (s/k>=threshold){c++;}
        }

        return c;

    }
}