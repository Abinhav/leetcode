// Last updated: 21/08/2026, 13:47:32
1class Solution {
2    public List<Integer> findLonely(int[] nums) {
3        List<Integer> ans=new ArrayList<>();
4       HashMap<Integer,Integer> map=new HashMap<>();
5       for(int x:nums){
6        map.put(x,map.getOrDefault(x,0)+1);
7       }
8       for(int x:nums){
9        if(map.get(x)==1 && (!map.containsKey(x+1) && !map.containsKey(x-1))){
10            ans.add(x);
11        }
12       }
13       return ans;
14    }
15}