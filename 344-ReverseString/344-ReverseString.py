# Last updated: 29/07/2026, 12:27:12
1class Solution:
2    def reverseString(self, s: List[str]) -> None:
3        l=0
4        r=len(s)-1
5        while l<r:
6            s[l],s[r]=s[r],s[l]
7            l+=1
8            r-=1
9        return s
10        