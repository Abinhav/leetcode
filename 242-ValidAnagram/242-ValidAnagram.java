// Last updated: 22/08/2026, 18:46:23
1class Solution {
2    public boolean isAnagram(String s, String t) {
3       if(s.length()!=t.length())        {
4        return false;
5       }
6       HashMap<Character,Integer> map=new HashMap<>();
7       for(char x: s.toCharArray()){
8        map.put(x,map.getOrDefault(x,0)+1);
9       }
10       for(char x:t.toCharArray()){
11        if(!map.containsKey(x)){
12            return false;
13            
14        }
15        map.put(x,map.get(x)-1);
16        if(map.get(x)==0){
17            map.remove(x);
18        }
19       }
20       return map.isEmpty();
21    }
22}