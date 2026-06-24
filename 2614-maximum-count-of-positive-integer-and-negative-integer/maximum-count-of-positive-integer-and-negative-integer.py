class Solution:
    def maximumCount(self, nums: List[int]) -> int:
        n=0
        p=0
        for x in nums:
            if x<0:n+=1
            if x>0:p+=1
        return p if p>n else n

        