// Last updated: 11/09/2026, 14:11:31
1class Solution {
2    public int sumDivisibleByK(int[] nums, int k) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int x:nums){
5            map.put(x,map.getOrDefault(x,0)+1);
6        }
7        int s=0;
8        for(int x:nums){
9            if(map.get(x)%k==0) s+=x;
10        }
11        return s;
12    }
13}