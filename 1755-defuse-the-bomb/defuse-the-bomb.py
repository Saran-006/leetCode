class Solution:
    def decrypt(self, code: List[int], k: int) -> List[int]:
        res=[]
        n=len(code)
        for i in range(n):
            x=0
            if k>0:index=i+1
            else:index=i-1
            s=0
            while x<abs(k):
                if index<0:
                    index+=n
                if index==n:index%=n

                s+=code[index]
                x+=1
                if k>0:
                    index+=1
                else:
                    index-=1
            res.append(s)
        return res
