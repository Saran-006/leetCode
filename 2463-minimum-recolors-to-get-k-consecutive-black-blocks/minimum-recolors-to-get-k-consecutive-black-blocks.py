class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        m=0
        n=len(blocks)
        for i in range(0,n-k+1):
            m=max(m,blocks[i:i+k].count("B"))
        if m>=k:return 0
        else:return k-m 