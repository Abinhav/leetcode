// Last updated: 11/09/2026, 12:38:28
1class Solution {
2    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
3        TreeMap<Integer,Integer> map=new TreeMap<>();
4        for(int x:bulbs){
5            map.put(x,map.getOrDefault(x,0)+1);
6        }
7        List<Integer> ans=new ArrayList<>();
8        for(int x:map.keySet()){
9            if(map.get(x)%2!=0) ans.add(x);
10        }
11        return ans;
12    }
13}