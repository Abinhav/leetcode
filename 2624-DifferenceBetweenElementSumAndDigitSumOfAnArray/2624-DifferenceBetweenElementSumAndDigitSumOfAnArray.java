// Last updated: 14/07/2026, 13:59:19
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int ds=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            while(temp!=0){
                int d=temp%10;
                ds+=d;
                temp/=10;
            }
        }
        return sum-ds;
    }
}