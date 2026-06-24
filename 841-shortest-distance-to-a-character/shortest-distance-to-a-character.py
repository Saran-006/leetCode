class Solution:
    def shortestToChar(self, s: str, cx: str) -> List[int]:
        l=[len(s) for i in s]
        for i in range(len(s)):
            if s[i]==cx:
                l[i]=0
                le=i-1
                r=i+1
                c=1
                while(le>=0 or r!=len(s)):
                    if le>=0:
                        if l[le]>c:l[le]=c
                        le-=1
                    if r<len(s):
                        if l[r]>c:l[r]=c
                        r+=1
                    c+=1
            
                
        print(l)
        return l



        