// Last updated: 21/08/2026, 14:12:03
1class Solution {
2    public long zeroFilledSubarray(int[] nums) {
3        long ans=0;
4        long c=0;
5        for(int x: nums){
6            if(x==0) {
7                c++;
8                ans+=c;
9            }
10            else{
11                c=0;
12            }
13        }
14        return ans;
15    }
16}