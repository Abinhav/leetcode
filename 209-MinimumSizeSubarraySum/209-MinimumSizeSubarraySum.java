// Last updated: 14/07/2026, 14:02:22
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int sum=0;
    int len=0;
    int ml=Integer.MAX_VALUE;
    int l=0;
    for(int r=0;r<nums.length;r++){
      sum+=nums[r];
      while(sum>=target){
        ml=Math.min(ml,r-l+1);
        sum-=nums[l];
        l++;
      }
    }
    if(ml==Integer.MAX_VALUE){
        return 0;
    }
    return ml;
    }
}