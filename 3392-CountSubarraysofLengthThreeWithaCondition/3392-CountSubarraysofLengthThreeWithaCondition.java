// Last updated: 31/08/2026, 11:20:54
1class Solution {
2    public int countSubarrays(int[] nums) {
3       int c=0;
4       for(int i=0;i+2<nums.length;i++){
5        if(2*(nums[i]+nums[i+2])==nums[i+1]) c++;
6       }
7       return c;
8    }
9}