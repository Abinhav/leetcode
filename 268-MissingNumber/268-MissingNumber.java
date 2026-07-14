// Last updated: 14/07/2026, 14:02:02
class Solution {
    public int missingNumber(int[] nums) {
        int a=nums.length;
        int xor=a;
        for(int i=0;i<a;i++){
            xor^=i^nums[i];
        }
        return xor;
    }
}