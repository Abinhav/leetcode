// Last updated: 15/07/2026, 14:38:08
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int x:nums){
5            map.put(x,map.getOrDefault(x,0)+1);
6        }
7        int ans=0;
8        for(int x:nums){
9            if(map.get(x)==1){
10                ans=x;
11            }
12        }
13        return ans;
14    }
15}