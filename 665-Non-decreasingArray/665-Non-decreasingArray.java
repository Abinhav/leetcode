// Last updated: 27/07/2026, 12:12:22
1class Solution {
2    public int findMin(int[] nums) {
3       int temp=nums[0];
4       for(int i=1;i<nums.length;i++) {
5        if(nums[i]<temp){
6            temp=nums[i];
7        }
8       }
9       return temp;
10    }
11}