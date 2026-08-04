// Last updated: 04/08/2026, 15:09:35
1class Solution {
2    public int percentageLetter(String s, char letter) {
3      HashMap<Character,Integer> map=new HashMap<>();
4      for(char x:s.toCharArray())  {
5        map.put(x,map.getOrDefault(x,0)+1);
6      }
7      if(!map.containsKey(letter)) return 0;
8      int c=map.get(letter);
9      return (c*100)/s.length();
10    }
11}