// Last updated: 14/07/2026, 14:01:38
class Solution {
    public int thirdMax(int[] nums) {
       
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int[] ans = new int[set.size()];
        int i = 0;

        for (int num : set) {
            ans[i++] = num;
        }
         Arrays.sort(ans);
        if(ans.length>=3){
            return ans[i-3];
        }
        int max=0;
        for(int x:ans){
            max=Math.max(max,x);
        }
        return max;
    }
}