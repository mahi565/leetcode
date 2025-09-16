class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        s1 = set(jewels)
        count = 0
        for i in stones:
            if i in s1:
                count+=1
        return count