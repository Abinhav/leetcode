// Last updated: 04/08/2026, 14:13:51
1class Solution {
2    public int findNonMinOrMax(int[] nums) {
3        if(nums.length<=2) return -1;
4        Arrays.sort(nums);
5        int min=nums[0];
6        int max=nums[nums.length-1];
7        for(int i=1;i<nums.length-1;i++){
8            if(nums[i]!=min&&nums[i]!=max) return nums[i];
9        }
10        return -1;
11    }
12}