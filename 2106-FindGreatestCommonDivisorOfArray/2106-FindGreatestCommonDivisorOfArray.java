// Last updated: 14/07/2026, 13:59:38
class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int x:nums){
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        while(max%min!=0){
            int rem=max%min;
            max=min;
            min=rem;
        }
        return min;
    }
}