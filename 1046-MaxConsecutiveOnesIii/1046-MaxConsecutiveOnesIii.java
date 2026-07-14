// Last updated: 14/07/2026, 14:00:32
class Solution {
    public int longestOnes(int[] nums, int k) {
        int mlen=0;
        int l=0;
        int z=0;
        int r=0;
        while(r<nums.length){
            while(z>k){
                if(nums[l]==0){
                    z-=1;
                    l++;
                }
                else{
                    l++;
                }
            }
            if(nums[r]==0){
                z++;
            }
            if(z<=k){
            mlen=Math.max(mlen,r-l+1);
            }
            r++;
        }
        return mlen;
    }
}