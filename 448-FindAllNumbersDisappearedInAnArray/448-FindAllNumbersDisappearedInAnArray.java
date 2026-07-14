// Last updated: 14/07/2026, 14:01:29
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> a=new HashSet<>();
        List<Integer> b=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!a.contains(i)){
                b.add(i);
            }
        }
        return b;
    }
}