class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums)<=1:return 
        x=[]
        k%=len(nums)
        
        print(len(nums)-k-1,len(nums))

        for i in range (len(nums)-k,len(nums)):
            x.append(nums[i])
        print(0,len(nums)-k) 
        for i in range (0,len(nums)-k):
            x.append(nums[i])

        print(x)
        
        for i in range(len(nums)):nums[i]=x[i]     


        