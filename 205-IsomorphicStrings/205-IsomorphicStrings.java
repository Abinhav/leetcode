// Last updated: 11/08/2026, 15:13:13
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3
4        if(s.length() != t.length()) return false;
5
6        HashMap<Character, Character> map  = new HashMap<>();
7        HashMap<Character, Character> mapp = new HashMap<>();
8
9        for(int i = 0; i<s.length(); i++){
10            char ch = s.charAt(i);
11            char chh = t.charAt(i);
12
13            if(map.containsKey(ch)){
14                if(map.get(ch) != chh){
15                    return false;
16                }
17            }else{
18                map.put(ch, chh);
19            }
20
21
22            if(mapp.containsKey(chh)){
23                if(mapp.get(chh) != ch){
24                    return false;
25                }
26            }else{
27                mapp.put(chh, ch);
28            }
29        }
30        return true;
31    }
32}