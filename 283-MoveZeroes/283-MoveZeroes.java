// Last updated: 14/07/2026, 14:01:59
class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
            nums[index]=nums[i];
            index++;
            }
        }
        while(index<n){
            nums[index++]=0;
        }
        
    }
}