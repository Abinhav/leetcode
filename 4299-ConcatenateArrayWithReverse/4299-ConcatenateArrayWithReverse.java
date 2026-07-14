// Last updated: 14/07/2026, 13:58:55
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int l=0;
        
        int arr[]=new int[nums.length*2];
        
        for(int i=0;i<nums.length;i++){
            arr[l++]=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            arr[l++]=nums[i];
        }
        return arr;
    }
}