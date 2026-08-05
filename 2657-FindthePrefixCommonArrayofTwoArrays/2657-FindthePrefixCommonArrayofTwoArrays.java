// Last updated: 05/08/2026, 15:21:25
1class Solution {
2    public int longestMonotonicSubarray(int[] nums) {
3        int ans=1;
4        int in=1,dc=1;
5        for(int i=0;i<nums.length-1;i++){
6            if(nums[i]<nums[i+1]){
7                   in++;
8            }
9            else{
10                in=1;
11            }
12            if(nums[i]>nums[i+1]){
13                dc++;
14            }
15            else{
16                dc=1;
17            }
18            ans=Math.max(ans,Math.max(in,dc));
19        }
20        
21        return ans;
22        
23    }
24}