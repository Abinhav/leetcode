// Last updated: 14/07/2026, 14:00:00
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return Math.max((nums[0]-1)*(nums[1]-1),(nums[n-1]-1)*(nums[n-2]-1));
    }
}