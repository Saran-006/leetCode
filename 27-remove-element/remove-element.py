class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        n=nums.count(val)
        for j in range(len(nums)):
            for i in range(len(nums)-1):
                if nums[i]==val:
                    nums[i+1],nums[i]=nums[i],nums[i+1]
        return (len(nums)-n)
        