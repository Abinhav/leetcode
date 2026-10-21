// Last updated: 21/10/2026, 20:08:13
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        map.put(0,1);
5        int c=0;
6        int p=0;
7        for(int x:nums){
8            p+=x;
9            if(map.containsKey(p-k)){
10                c+=map.get(p-k);
11            }
12            map.put(p,map.getOrDefault(p,0)+1);
13        }
14        return c;
15    }
16}