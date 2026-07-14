// Last updated: 14/07/2026, 14:03:23
class Solution {
    public int removeDuplicates(int[] nums) {
        int s=1;
        for(int r=1;r<nums.length;r++){
            if(nums[r]!=nums[s-1]){
                nums[s]=nums[r];
                s++;
            }
        }
        return s;
    }
}