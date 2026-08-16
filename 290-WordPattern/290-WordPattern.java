// Last updated: 16/08/2026, 18:32:09
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3
4        String[] words = s.split(" ");
5
6        if (pattern.length() != words.length) {
7            return false;
8        }
9
10        HashMap<Character, String> map = new HashMap<>();
11        HashSet<String> used = new HashSet<>();
12
13        for (int i = 0; i < pattern.length(); i++) {
14
15            char ch = pattern.charAt(i);
16            String word = words[i];
17
18            if (map.containsKey(ch)) {
19
20                if (!map.get(ch).equals(word)) {
21                    return false;
22                }
23
24            } else {
25
26                if (used.contains(word)) {
27                    return false;
28                }
29
30                map.put(ch, word);
31                used.add(word);
32            }
33        }
34
35        return true;
36    }
37}