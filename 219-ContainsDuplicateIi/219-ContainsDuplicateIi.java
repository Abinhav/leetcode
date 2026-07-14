// Last updated: 14/07/2026, 14:02:19
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(a.containsKey(nums[i])){
                if(i-a.get(nums[i])<=k){
                    return true;
                }
            }
            a.put(nums[i],i);
        }
        return false;
    }
}