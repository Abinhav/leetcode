// Last updated: 14/07/2026, 14:02:36
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        int n=nums.length;
        for(int x:nums){
            a.put(x,a.getOrDefault(x,0)+1);
            if(a.get(x)>n/2){
                return x;
            }
        }
        return -1;
    }
}