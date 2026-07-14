// Last updated: 14/07/2026, 13:59:42
class Solution {
    public int[] buildArray(int[] nums) {
        int arr[]=new int[nums.length];
        int i=0;
        while(i<nums.length){
            arr[i]=nums[nums[i]];
            i++;
        }
        return arr;
    }
}