import math
class Solution(object):
    def judgeSquareSum(self, c):
        """
        :type c: int
        :rtype: bool
        """
        for i in range(int(math.sqrt(c))+1):
            x=sqrt(c-(i**2))
            if(x.is_integer()):
                return True
        return False
        