class Solution:
    def reverse(self, x: int) -> int:
        if -2**31 <= x <= 2**31 - 1:
            isN=x<0
            if isN:x*=-1
            m=-1 if isN else 1
            x = m*int(str(x)[::-1])
            if -2**31 <= x <= 2**31 - 1:
                return x
        return 0
        