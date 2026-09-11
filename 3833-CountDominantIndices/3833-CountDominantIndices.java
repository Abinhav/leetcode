// Last updated: 11/09/2026, 12:32:22
1class Solution {
2    public int dominantIndices(int[] nums) {
3        int c=0;
4        for(int i=0;i<nums.length-1;i++){
5            int s=0;
6            for(int j=i+1;j<nums.length;j++){
7                s+=nums[j];
8            }
9            if(nums[i]>s/(nums.length-(i+1))) c++;
10        }
11        return c;
12    }
13}