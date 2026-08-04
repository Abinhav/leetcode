// Last updated: 04/08/2026, 11:35:40
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3     List<Integer> ans=new ArrayList<>();
4    int max=0,min=Integer.MAX_VALUE;
5    for(int x:nums){
6        max=Math.max(max,x);
7        min=Math.min(min,x);
8    }
9    Arrays.sort(nums);
10    HashSet<Integer> set=new HashSet<>();
11    for(int i=0;i<nums.length;i++){
12        set.add(nums[i]);
13    }
14    for(int i=min;i<=max;i++){
15        if(!set.contains(i)){
16            ans.add(i);
17        }
18    }
19    return ans;
20    }
21}