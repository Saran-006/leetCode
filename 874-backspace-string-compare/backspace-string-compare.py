class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        r=""
        for i in s:
            if i=="#":r=r[:-1]
            else:r+=i
        u=""
        for i in t:
            if i=="#":u=u[:-1]
            else:u+=i
        return r==u
        