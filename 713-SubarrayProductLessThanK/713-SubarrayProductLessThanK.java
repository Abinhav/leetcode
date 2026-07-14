// Last updated: 14/07/2026, 14:00:55
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
      int c=0;
      int r=0,l=0;
      int pro=1;
      while(r<nums.length){
          pro*=nums[r];
          while(pro>=k){
            pro/=nums[l];
            l++;
          }
          
            c+=r-l+1;
          
          r++;
      }
       return c;
    }
}