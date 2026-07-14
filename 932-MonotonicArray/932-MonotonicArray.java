// Last updated: 14/07/2026, 14:00:41
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean bool=true;
        boolean bool1=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                bool=false;
            }
            else if(nums[i]<nums[i+1]){
                bool1=false;
            }
        }
        return bool||bool1;
    }
}