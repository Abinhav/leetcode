// Last updated: 29/08/2026, 15:19:42
1class Solution {
2    public int maxDifference(String s) {
3        HashMap<Character,Integer> map=new HashMap<>();
4        for(char x:s.toCharArray()) map.put(x,map.getOrDefault(x,0)+1);
5        int ev=Integer.MAX_VALUE,od=0;
6        for(char x:map.keySet()){
7            if(map.get(x)%2==0){
8                ev=Math.min(ev,map.get(x));
9            }
10            else{
11                od=Math.max(od,map.get(x));
12            }
13            
14           
15        }
16        return od-ev;
17        
18    }
19}