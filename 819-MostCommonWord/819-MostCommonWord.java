// Last updated: 12/08/2026, 10:38:28
1class Solution {
2    public String mostCommonWord(String s, String[] banned) {
3
4        HashSet<String> set = new HashSet<>();
5        HashMap<String, Integer> map = new HashMap<>();
6
7        for (String x : banned) {
8            set.add(x.toLowerCase());
9        }
10
11        String w = "";
12
13        for (int i = 0; i < s.length(); i++) {
14
15            char c = Character.toLowerCase(s.charAt(i));
16
17            if (c >= 'a' && c <= 'z') {
18                w += c;
19            } 
20            else {
21
22                if (!w.isEmpty()) {
23
24                    if (!set.contains(w)) {
25                        map.put(w, map.getOrDefault(w, 0) + 1);
26                    }
27
28                    w = "";
29                }
30            }
31        }
32
33        // Last word
34        if (!w.isEmpty() && !set.contains(w)) {
35            map.put(w, map.getOrDefault(w, 0) + 1);
36        }
37
38        String ans = "";
39        int max = 0;
40
41        for (String x : map.keySet()) {
42            if (map.get(x) > max) {
43                max = map.get(x);
44                ans = x;
45            }
46        }
47
48        return ans;
49    }
50}