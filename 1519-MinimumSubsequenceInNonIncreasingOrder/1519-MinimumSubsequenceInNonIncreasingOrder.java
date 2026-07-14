// Last updated: 14/07/2026, 14:00:05
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        ans.add(nums[nums.length-1]);
        int max=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            int sum=0;
            for(int j=i;j>=0;j--){
                sum+=nums[j];
            }
            if(sum<max){

                return ans;
            }
            else{
                max+=nums[i];
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}