// Last updated: 14/07/2026, 14:00:34
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum=0;
        int max=0;
        int mmax=nums[0];
        int min=0;
        int mmin=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(nums[i],max+nums[i]);
            mmax=Math.max(mmax,max);
            min=Math.min(nums[i],min+nums[i]);
            mmin=Math.min(mmin,min);
        }
        int tmax=Math.max(mmax,sum-mmin);
        if(mmax<0){
            return mmax;
        }
        else{
            return tmax;
        }
    }
}