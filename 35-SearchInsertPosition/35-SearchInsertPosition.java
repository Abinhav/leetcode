// Last updated: 14/07/2026, 14:03:12
class Solution {
    public int searchInsert(int[] nums, int target) {
       int l=0;
       int r=nums.length-1; 
       while(l<=r){
        int mid=(l+r)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]<target){
            l+=1;
        }
        else{
            r-=1;
        }
       }
       return l;
    }
}