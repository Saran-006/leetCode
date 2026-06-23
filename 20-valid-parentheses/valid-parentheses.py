class Solution:
    def isValid(self, x: str) -> bool:
        s=""
        for i in x:
            if i in "{[(":
                s+=i
            else:
                if len(s)==0:return False
                if i=="}" and s[-1]=="{":
                    s=s[:-1]
                elif i=="]" and s[-1]=="[":
                    s=s[:-1]
                elif i==")" and s[-1]=="(":
                    s=s[:-1]
                else:return False
            
        return len(s)==0
                
        