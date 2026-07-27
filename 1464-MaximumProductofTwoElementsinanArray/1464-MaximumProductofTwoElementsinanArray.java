// Last updated: 27/07/2026, 11:06:53
1class Solution {
2    public int maxProduct(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        return Math.max((nums[0]-1)*(nums[1]-1),(nums[n-1]-1)*(nums[n-2]-1));
6    }
7}