class Solution:
    def removeDuplicates(self, l: List[int]) -> int:
        x=list(set(l))
        x.sort()
        for i in range(len(x)):l[i]=x[i]
        return len(x)