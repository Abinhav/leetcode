// Last updated: 14/07/2026, 14:02:48
class Solution {
    public int singleNumber(int[] nums) {
       int res=0;
       for(int x:nums) {
        res^=x;
       }
       return res;
    }
}