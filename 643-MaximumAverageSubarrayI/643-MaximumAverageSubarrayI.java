// Last updated: 14/07/2026, 14:01:02
class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int sum=0;
      for(int i=0;i<k;i++){
        sum+=nums[i];
      }
      int max=sum;
      int l=0;
      for(int i=k;i<nums.length;i++){
        sum+=nums[i];
        sum-=nums[l];
        max=Math.max(max,sum);
        l++;
      }
      return (double)max/k;
    }
}