// Last updated: 14/07/2026, 13:59:39
class Solution {
    public int[] getConcatenation(int[] nums) {
        int a=nums.length;
        int arr[]=new int[a*2];
        for(int i=0;i<a;i++){
            arr[i]=nums[i];
            arr[i+a]=nums[i];
        }
        return arr;
    }
}