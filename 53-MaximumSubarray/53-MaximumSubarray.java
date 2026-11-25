// Last updated: 25/11/2026, 19:07:41
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int max=nums[0];
4        int m1=nums[0];
5        for(int i=1;i<nums.length;i++){
6           max=Math.max(nums[i],max+nums[i]);
7           m1=Math.max(max,m1);
8        }
9        return m1;
10    }
11}