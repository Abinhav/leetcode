// Last updated: 14/07/2026, 14:01:26
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mlen=0;
        int c=0;
        for(int x:nums){
            if(x==1){
                c++;
                mlen=Math.max(mlen,c);
            }
            else{
                c=0;
            }
        }
        return mlen;
    }
}