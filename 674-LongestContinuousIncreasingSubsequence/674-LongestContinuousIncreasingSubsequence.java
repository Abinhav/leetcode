// Last updated: 16/08/2026, 19:00:09
1class Solution {
2    public int findLengthOfLCIS(int[] nums) {
3        int max=0,c=1;
4        if(nums.length==1) return 1;
5        for(int i=0;i<nums.length-1;i++){
6          if(nums[i]<nums[i+1]){
7            c++;
8          }
9          else{
10            c=1;
11          }
12          max=Math.max(c,max);
13        }
14        return max;
15    }
16}