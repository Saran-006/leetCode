class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        System.gc();
        int c=0;
        int s=0;
        for(int i=0;i<k;i++){
            s+=arr[i];
        }
        int n=arr.length;
        if (s/k>=threshold){c++;}
        for(int i=1;i<n-k+1;i++){
            s-=arr[i-1];
            s+=arr[i+k-1];
            if (s/k>=threshold){c++;}
        }

        return c;

    }
}