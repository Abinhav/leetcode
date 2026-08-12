// Last updated: 12/08/2026, 11:24:53
1class Solution {
2    public int findLHS(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int x:nums){
5            map.put(x,map.getOrDefault(x,0)+1);
6        }
7        int max=0;
8        for(int x:map.keySet()){
9           if(map.containsKey(x+1)){
10            max=Math.max(max,map.get(x)+map.get(x+1));
11
12           }
13        }
14        return max;
15    }
16}