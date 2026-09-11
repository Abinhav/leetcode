// Last updated: 11/09/2026, 11:11:39
1class Solution {
2    public boolean isMiddleElementUnique(int[] nums) {
3        int mid=nums[nums.length/2];
4        for(int i=0;i<nums.length;i++){
5            if(i==nums.length/2) continue;
6            if(nums[i]==mid) return false;
7        }
8        return true;
9    }
10}