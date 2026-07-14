// Last updated: 14/07/2026, 14:03:10
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            int cor=nums[i]-1;
            if(nums[i]>0&&nums[i]<n&&nums[i]!=nums[cor]){
                int temp=nums[i];
                nums[i]=nums[cor];
                nums[cor]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return n+1;
    }
}