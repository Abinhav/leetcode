// Last updated: 04/08/2026, 11:37:18
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3     List<Integer> ans=new ArrayList<>();
4    int max=0,min=Integer.MAX_VALUE;
5   
6    Arrays.sort(nums);
7    HashSet<Integer> set=new HashSet<>();
8    for(int i=0;i<nums.length;i++){
9        set.add(nums[i]);
10    }
11    for(int i=nums[0];i<=nums[nums.length-1];i++){
12        if(!set.contains(i)){
13            ans.add(i);
14        }
15    }
16    return ans;
17    }
18}